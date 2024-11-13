import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRegistrationTable {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "username", "password");
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE Registration ("
                       + "id INT PRIMARY KEY, "
                       + "name VARCHAR(50), "
                       + "address VARCHAR(100), "
                       + "program VARCHAR(50))";
            statement.executeUpdate(sql);
            System.out.println("Table 'Registration' created successfully!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
