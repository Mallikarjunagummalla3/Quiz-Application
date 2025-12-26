// this is for the project
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Profile extends JFrame implements ActionListener {

    JButton startQuizBtn;
    String username;

    Profile(String name) {
        username = name;

        setTitle("Profile Page");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel welcome = new JLabel("Welcome, " + username);
        welcome.setFont(new Font("Arial", Font.BOLD, 18));
        welcome.setBounds(100, 60, 250, 30);
        add(welcome);

        startQuizBtn = new JButton("Start Quiz");
        startQuizBtn.setBounds(130, 150, 120, 30);
        startQuizBtn.addActionListener(this);
        add(startQuizBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        new Quiz(username);
        dispose();
    }
}
