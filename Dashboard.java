package com.java.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public Dashboard(String username) {

        setTitle("Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        
        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(welcomeLabel, BorderLayout.NORTH);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton profileBtn = new JButton("Profile");
        JButton settingsBtn = new JButton("Settings");
        JButton logoutBtn = new JButton("Logout");

        panel.add(profileBtn);
        panel.add(settingsBtn);
        panel.add(logoutBtn);

        add(panel, BorderLayout.CENTER);

       
        logoutBtn.addActionListener(e -> {
            dispose(); 
            new LoginForm().setVisible(true);
        });
    }
}

