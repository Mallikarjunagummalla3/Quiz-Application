import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {

    Score(String name, int score) {
        setTitle("Score Page");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel result = new JLabel("Name: " + name);
        result.setFont(new Font("Arial", Font.BOLD, 16));
        result.setBounds(120, 80, 200, 30);
        add(result);

        JLabel scoreLabel = new JLabel("Score: " + score);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scoreLabel.setBounds(140, 130, 200, 30);
        add(scoreLabel);

        setVisible(true);
    }
}
