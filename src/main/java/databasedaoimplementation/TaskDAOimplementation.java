package databasedaoimplementation;

import com.google.inject.Inject;
import databasedaointerface.TasksDAO;
import model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAOimplementation implements TasksDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskDAOimplementation.class);

    private final Connection conn;

    @Inject
    public TaskDAOimplementation(Connection conn){
        this.conn = conn;
    }


    @Override
    public Task getTaskById(int id, String query) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        Task task = new Task();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()){
            check = true;
            task.setTask_id(rs.getInt("taskid"));
            task.setTask_name(rs.getString("taskname"));
            task.setTask_priority(rs.getInt("priority"));
        }

        if (check){
            return task;
        }else{
            return null;
        }
    }

    @Override
    public List<Task> getTaskByName(String query, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        List<Task> taskList = new ArrayList<>();

        while (rs.next()){
            Task task = new Task();
            task.setTask_id(rs.getInt("taskid"));
            task.setTask_name(rs.getString("taskname"));
            task.setTask_priority(rs.getInt("priority"));
            taskList.add(task);
            break;
        }
        return taskList;
    }

    @Override
    public Task add(Task task, String query) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, task.getTask_name());
        ps.setInt(2, task.getTask_priority());
        ps.setString(3, task.getTask_description());
        ps.executeUpdate();
        return task;
    }

    @Override
    public String deleteTaskById(int id, String query) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        return "Successfully deleted task with id "+id;
    }

    @Override
    public List<Task> getTasks(String query) throws SQLException {
        LOGGER.info(conn+"");
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Task> taskList = new ArrayList<>();

        while (rs.next()){
            Task task = new Task();
            task.setTask_id(rs.getInt("taskid"));
            task.setTask_name(rs.getString("taskname"));
            task.setTask_description(rs.getString("taskdescription"));
            task.setTask_priority(rs.getInt("priority"));
            taskList.add(task);
        }
        if (taskList.isEmpty()){
            LOGGER.info("No Tasks present in the database");
            return null;
        }
        else return taskList;
    }

    @Override
    public Task updateTask(Task task, String query) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, task.getTask_name());
        ps.setInt(2, task.getTask_priority());
        ps.setInt(3, task.getTask_id());
        ps.executeUpdate();
        return task;
    }
}
