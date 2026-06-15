package exercise12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(15, 77, 90));

        JLabel label = new JLabel("Welcome");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        titlePanel.add(label);

        JPanel form = new JPanel();
        form.setLayout(new GridLayout(5, 2, 10, 25));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton submit = new JButton("Register");
        submit.setBackground(new Color(15, 77, 90));
        submit.setForeground(Color.WHITE);
        submit.setFocusPainted(false);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            frame,
                            "Error: Please fill all fields!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            frame,
                            "Registration Successful!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        form.add(nameLabel);
        form.add(nameField);

        form.add(emailLabel);
        form.add(emailField);

        form.add(passwordLabel);
        form.add(passwordField);

        form.add(new JLabel(""));
        form.add(submit);

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(form, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}