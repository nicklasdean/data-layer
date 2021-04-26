package com.example.demo.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private static String dbConnectionString;
    private static String username;
    private static String password;
    private static Connection connectionInstance = null;

    public static Connection getConnection(){
        if(connectionInstance != null){
            return connectionInstance;
        }

        try (InputStream stream = new FileInputStream("src/main/resources/application.properties")){
            Properties prop = new Properties();
            prop.load(stream);
            dbConnectionString = prop.getProperty("dbConnectString");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
        }
        catch(IOException e){
            System.out.println("Problem with property file reading");
        }

        try {
            connectionInstance = DriverManager.getConnection(dbConnectionString, username, password);
        }
        catch(SQLException e){
            System.out.println("Something wrong in database connection");
        }
        return connectionInstance;
    }
}
