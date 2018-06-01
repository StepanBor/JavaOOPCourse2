package pack1;

import java.sql.*;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class GroupDatabase {
    static String url = "jdbc:mysql://localhost:3306/students";
    static String username = "root";
    static String password = "1979";
    public static void createGroupTable() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = getConnection(url, username, password); Statement statement = connection.createStatement()) {

              statement.executeUpdate("create table if not exists GroupStudent (id SERIAL, Namest VARCHAR(100), LastName VARCHAR(100), Age INT, Sex ENUM('mail','femail'), Citizenship VARCHAR(100), PRIMARY KEY (id))");

        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void addStudent(Student student) throws ClassNotFoundException {

//        String url = "jdbc:mysql://localhost:3306/students";
//        String username = "root";
//        String password = "1979";
//        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {
            statement.executeUpdate("create table if not exists GroupStudent (id SERIAL, Namest VARCHAR(100), LastName VARCHAR(100), Age INT, Sex ENUM('Mail','Femail'), Citizenship VARCHAR(100), PRIMARY KEY (id))");
            statement.executeUpdate("insert into GroupStudent (Namest, LastName, Age, Sex, Citizenship)"+
//            "VALUES ('"+"'"+student.getName()+"',"+"'"+student.getLastname()+"',"+student.getAge()+",'"+student.getSex()+"',"+"'"+student.getCitizenship()+"')");
            "VALUES ('"+student.getName()+"','"+student.getLastname()+"',"+student.getAge()+",'"+student.getSex()+"','"+student.getCitizenship()+"')");

        } catch (SQLException e){
            System.out.println(e);
        }

    }


}
