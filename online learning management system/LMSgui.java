import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LMSgui extends JFrame {
    private LMS lms;

    public LMSgui() {
        lms = new LMS();

        setTitle("Online Learning Management System");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 10, 100, 25);
        add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(120, 10, 200, 25);
        add(txtName);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 40, 100, 25);
        add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(120, 40, 200, 25);
        add(txtEmail);

        JLabel lblRole = new JLabel("Role:");
        lblRole.setBounds(10, 70, 100, 25);
        add(lblRole);

        JTextField txtRole = new JTextField();
        txtRole.setBounds(120, 70, 200, 25);
        add(txtRole);

        JButton btnAddUser = new JButton("Add User");
        btnAddUser.setBounds(10, 110, 150, 25);
        add(btnAddUser);

        btnAddUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String email = txtEmail.getText();
                String role = txtRole.getText();
                User user = new User(name, email, role);

                try {
                    lms.addUser(user);
                    JOptionPane.showMessageDialog(null, "User added successfully.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error adding user.");
                }
            }
        });

        JLabel lblCourseTitle = new JLabel("Course Title:");
        lblCourseTitle.setBounds(10, 150, 100, 25);
        add(lblCourseTitle);

        JTextField txtCourseTitle = new JTextField();
        txtCourseTitle.setBounds(120, 150, 200, 25);
        add(txtCourseTitle);

        JButton btnAddCourse = new JButton("Add Course");
        btnAddCourse.setBounds(10, 190, 150, 25);
        add(btnAddCourse);

        btnAddCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = txtCourseTitle.getText();
                Course course = new Course(title, "Sample description", "Sample syllabus");

                try {
                    lms.addCourse(course);
                    JOptionPane.showMessageDialog(null, "Course added successfully.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error adding course.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LMSgui();
    }
}
