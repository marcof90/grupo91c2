package services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class JavaMySQLService {
    
    public final static String FILE_PATH = "./data/db.properties";

    private Connection connect;
    private String url;
    private String user;
    private String password;

    public JavaMySQLService() {
        super();
        loadPropertiesDB();
        connectDB();
    }

    public Connection getConnect() {
        return connect;
    }

    public void connectDB() {
        try {
            connect = DriverManager.getConnection(url, user, password);
            boolean valid = connect.isValid(3600);
            System.out.println(valid ? "Connected":"Failed");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void loadPropertiesDB() {
        try {
            InputStream ins = new FileInputStream(FILE_PATH);
            Properties prop = new Properties();
            prop.load(ins);
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            ins.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertUser(Date fechaNacimiento, String nombre) {
        String sql = "INSERT INTO `users`(`nombre`, `fecha_nacimiento`) VALUES ('"+nombre+"','"+fechaNacimiento+"')";
        try {
            Statement stmt = connect.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getUsersDB() {
        String sql = "SELECT * FROM users";
        ResultSet rs = null;
        try {
            Statement stmt = connect.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
}
