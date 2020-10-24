package databasedaointerface;

import model.Task;

import java.sql.SQLException;
import java.util.List;

public interface TasksDAO {

    public Task add(Task task) throws SQLException;
    public String deleteTaskById(int id)throws SQLException;
    public Task getTaskById(int id) throws SQLException;
    public List<Task> getTaskByName(String query, String name) throws SQLException;
    public List<Task> getTasks() throws SQLException;
    public Task updateTask(Task task) throws SQLException;

}
