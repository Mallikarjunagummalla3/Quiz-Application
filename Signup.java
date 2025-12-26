import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {

    JTextField userField;
    JPasswordField passField;
    JButton registerBtn;

    Signup() {
        setTitle("Sign Up");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("SIGN UP");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(150, 20, 100, 30);
        add(title);

        JLabel user = new JLabel("Username:");
        user.setBounds(50, 80, 100, 25);
        add(user);

        userField = new JTextField();
        userField.setBounds(150, 80, 150, 25);
        add(userField);

        JLabel pass = new JLabel("Password:");
        pass.setBounds(50, 120, 100, 25);
        add(pass);

        passField = new JPasswordField();
        passField.setBounds(150, 120, 150, 25);
        add(passField);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(130, 180, 120, 30);
        registerBtn.addActionListener(this);
        add(registerBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Registration Successful!");
        new Login();
        dispose();
    }
}
