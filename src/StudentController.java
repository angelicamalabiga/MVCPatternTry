import java.awt.event.*;

import javax.swing.JOptionPane;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;

        // Button listeners
        view.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        view.btnCancel.addActionListener(e -> clearForm());
    }

    // When user clicks SUBMIT
    private void submitForm() {
        String username = view.txtUser.getText();
        String password = view.txtPass.getText();

        model.setUsername(username);
        model.setPassword(password);

        JOptionPane.showMessageDialog(view,
                "Submitted!\nUsername: " + model.getUsername() +
                "\nPassword: " + model.getPassword());
    }

    // When user clicks CANCEL
    private void clearForm() {
        view.txtUser.setText("");
        view.txtPass.setText("");
    }
}
