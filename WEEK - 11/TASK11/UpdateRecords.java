import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecords {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "username", "password");
            String sql = "UPDATE Registration SET program = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            // Update program for id 100
            statement.setString(1, "Data Science");
            statement.setInt(2, 100);
            statement.executeUpdate();

            // Update program for id 101
            statement.setString(1, "Biology");
            statement.setInt(2, 101);
            statement.executeUpdate();

            System.out.println("Records updated successfully!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
