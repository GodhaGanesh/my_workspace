package exercise10;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class RegistrationPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration");
        frame.setSize(400, 550);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        String wish;
        LocalTime time = LocalTime.now();
        int hh = time.getHour();
        if (hh >= 5 && hh < 12) wish = "Morning";
        else if (hh >= 12 && hh < 17) wish = "Afternoon";
        else if (hh >= 17 && hh < 21) wish = "Evening";
        else wish = "Night";

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(15, 77, 90));
        titlePanel.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("Welcome,");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel greet = new JLabel("Good " + wish);
        greet.setFont(new Font("Arial", Font.BOLD, 22));
        greet.setForeground(Color.WHITE);
        greet.setHorizontalAlignment(SwingConstants.CENTER);

        titlePanel.add(label);
        titlePanel.add(greet);

        JPanel form = new JPanel();
        form.setLayout(new GridLayout(5, 2, 10, 25));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        genderPanel.add(male);
        genderPanel.add(female);

        JButton submit = new JButton("Register");
        submit.setBackground(new Color(15, 77, 90));
        submit.setForeground(Color.WHITE);
        submit.setFocusPainted(false);

        form.add(nameLabel);
        form.add(nameField);
        form.add(emailLabel);
        form.add(emailField);
        form.add(passwordLabel);
        form.add(passwordField);
        form.add(genderLabel);
        form.add(genderPanel);
        form.add(new JLabel(""));
        form.add(submit);

        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(form, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}