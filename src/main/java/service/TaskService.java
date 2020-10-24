package service;

import databasedaoimplementation.TaskDAOimplementation;
import model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

public class TaskService {

    private final TaskDAOimplementation taskDAOimplementation;
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskService.class);

    private static final String TABLE_NAME = "tasks";
    private static final String INSERT_QUERY = "INSERT INTO "+TABLE_NAME+" (taskname, priority) VALUES(?, ?)";
    private static final String GET_QUERY = "SELECT * FROM "+TABLE_NAME+" WHERE taskid= ?";
    private static final String GET_ALL_QUERY = "SELECT * FROM "+TABLE_NAME;
    private static final String DELETE_QUERY = "DELETE FROM "+TABLE_NAME+" WHERE taskid= ?";
    private static final String UPDATE_TASK_PRIORITY_NAME = "UPDATE "+TABLE_NAME+" SET taskname = ?, priority= ? WHERE taskid= ?";
    private static final String GET_TASK_BY_NAME = "SELECT * FROM "+TABLE_NAME+" WHERE taskname= ?";

    @Inject
    public TaskService(TaskDAOimplementation taskDAOimplementation){
        this.taskDAOimplementation = taskDAOimplementation;
    }

    public List<Task> getTasks() throws SQLException {
        return taskDAOimplementation.getTasks();
    }

    public Task getTaskById(int id) throws SQLException{
        return taskDAOimplementation.getTaskById(id);
    }

    public Task addTask(Task task) throws SQLException{
        taskDAOimplementation.add(task);
        return taskDAOimplementation.getTaskByName(GET_TASK_BY_NAME, task.getTask_name()).get(0);
    }

    public String deleteTask(int id) throws SQLException{
        if (getTaskById(id) == null){
            LOGGER.warn("Cannot find task with given id "+id);
            return null;
        }
        return taskDAOimplementation.deleteTaskById(id);
    }

    public Task updateTaskById(int id, Task task) throws SQLException{
        if (getTaskById(id) == null){
            LOGGER.warn("Cannot find task with given id "+id);
            return null;
        }
        taskDAOimplementation.updateTask(task);
        return getTaskById(id);
    }

}
