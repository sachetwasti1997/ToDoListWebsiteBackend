import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ToDoListServiceModel extends AbstractModule {
    private final ToDoListServiceConfiguration configuration;

    public ToDoListServiceModel(ToDoListServiceConfiguration configuration){
        this.configuration = configuration;
    }

    @Provides
    @Singleton
    private Connection createConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/todolist?characterEncoding=latin1";
        String user = "root";
        String pass = "Wasti786@";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

}
