package sample;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    //public Connection databaseLink;
    public Connection connection;
    /*public Connection getConnection(){
       String databaseName = "votingsystem";
       String databaseUser = "Silas Sangmin";
       String password = "admin";
       String url = "jdbc:mysql://localhost/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName ,databaseName,password );
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();

        }

        return connection;



    }*/
}
