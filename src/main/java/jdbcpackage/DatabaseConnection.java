package jdbcpackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseConnection.class);

    private static Connection conn = null;

    static {
        LOGGER.info("Static method called!!!");
        String url = "jdbc:mysql://localhost:3306/todolist?characterEncoding=latin1";
        String user = "root";
        String pass = "Wasti786@";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }catch (ClassNotFoundException | SQLException e){
            LOGGER.error(e.getMessage());
        }
    }

    public static Connection getConnection(){
        LOGGER.info("Connection "+conn);
        return conn;
    }

}
