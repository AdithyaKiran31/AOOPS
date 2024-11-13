import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "username", "password");
            String sql = "INSERT INTO Registration (id, name, address, program) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            // Insert four records
            statement.setInt(1, 100);
            statement.setString(2, "John Doe");
            statement.setString(3, "123 Elm St");
            statement.setString(4, "Computer Science");
            statement.executeUpdate();

            statement.setInt(1, 101);
            statement.setString(2, "Jane Smith");
            statement.setString(3, "456 Oak St");
            statement.setString(4, "Mathematics");
            statement.executeUpdate();

            statement.setInt(1, 102);
            statement.setString(2, "Alice Johnson");
            statement.setString(3, "789 Maple St");
            statement.setString(4, "Physics");
            statement.executeUpdate();

            statement.setInt(1, 103);
            statement.setString(2, "Bob Brown");
            statement.setString(3, "321 Pine St");
            statement.setString(4, "Chemistry");
            statement.executeUpdate();

            System.out.println("Records inserted successfully!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
