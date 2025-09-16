package com.java.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
    
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

    
        JLabel titleLabel = new JLabel("Login Page", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(100, 20, 200, 40);
        add(titleLabel);

   
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 80, 200, 25);
        add(usernameField);

        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 100, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 25);
        add(passwordField);

        
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 180, 100, 30);
        add(loginButton);

    
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

               
                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    dispose(); // close login window
                    new Dashboard(username).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
