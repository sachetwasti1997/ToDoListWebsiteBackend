package databasedaointerface;

import model.Task;

import java.sql.SQLException;
import java.util.List;

public interface TasksDAO {

    public Task add(Task task, String query) throws SQLException;
    public String deleteTaskById(int id, String query)throws SQLException;
    public Task getTaskById(int id, String query) throws SQLException;
    public List<Task> getTaskByName(String query, String name) throws SQLException;
    public List<Task> getTasks(String query) throws SQLException;
    public Task updateTask(Task task, String query) throws SQLException;

}
