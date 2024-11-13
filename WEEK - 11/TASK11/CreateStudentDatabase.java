import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "username", "password");
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE Student";
            statement.executeUpdate(sql);
            System.out.println("Database 'Student' created successfully!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
