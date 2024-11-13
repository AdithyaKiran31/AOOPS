import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "username", "password");
            String sql = "DELETE FROM Registration WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 101);
            statement.executeUpdate();

            System.out.println("Record deleted successfully!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
