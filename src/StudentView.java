import javax.swing.*;
import java.awt.*;

public class StudentView extends JFrame {

    public JTextField txtUser = new JTextField(20);
    public JTextField txtPass = new JTextField(20);
    public JTextField txtage = new JTextField(20);
    public JButton btnSubmit = new JButton("SUBMIT");
    public JButton btnCancel = new JButton("CANCEL");

    public StudentView() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblUser = new JLabel("USERNAME");
        JLabel lblPass = new JLabel("PASSWORD");
        JLabel lblAge = new JLabel("AGE");

        lblUser.setBounds(10, 10, 100, 30);
        txtUser.setBounds(120, 10, 150, 30);

        lblPass.setBounds(10, 50, 100, 30);
        txtPass.setBounds(120, 50, 150, 30);
        
        lblAge.setBounds(10, 80, 100, 30);
        lblAge.setBounds(120, 90, 150, 30);


        btnSubmit.setBounds(10, 90, 100, 30);
        btnCancel.setBounds(120, 90, 100, 30);

        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPass);
        panel.add(lblAge);

        panel.add(txtPass);
        panel.add(btnSubmit);
        panel.add(btnCancel);

        this.setTitle("Malabiga");
        this.setBounds(300, 300, 320, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setVisible(true);
    }
}
