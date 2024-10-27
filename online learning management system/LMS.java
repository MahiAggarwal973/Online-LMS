import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LMS {
    public void addUser(User user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO users (name, email, role) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getEmail());
        stmt.setString(3, user.getRole());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void addCourse(Course course) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO courses (title, description, syllabus) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, course.getTitle());
        stmt.setString(2, course.getDescription());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}