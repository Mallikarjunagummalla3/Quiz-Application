import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JLabel question;
    JRadioButton o1, o2, o3, o4;
    ButtonGroup bg;
    JButton nextBtn;
    int count = 0, score = 0;
    String username;

    String[][] questions = {
            {"Java is?", "Language", "OS", "Browser", "Game", "Language"},
            {"JVM stands for?", "Java Virtual Machine", "Java Value Method", "Joint VM", "None", "Java Virtual Machine"}
    };

    Quiz(String name) {
        username = name;

        setTitle("Quiz Page");
        setSize(500, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        question = new JLabel();
        question.setBounds(50, 30, 400, 30);
        add(question);

        o1 = new JRadioButton();
        o2 = new JRadioButton();
        o3 = new JRadioButton();
        o4 = new JRadioButton();

        o1.setBounds(50, 80, 200, 25);
        o2.setBounds(50, 110, 200, 25);
        o3.setBounds(50, 140, 200, 25);
        o4.setBounds(50, 170, 200, 25);

        bg = new ButtonGroup();
        bg.add(o1); bg.add(o2); bg.add(o3); bg.add(o4);

        add(o1); add(o2); add(o3); add(o4);

        nextBtn = new JButton("Next");
        nextBtn.setBounds(180, 220, 100, 30);
        nextBtn.addActionListener(this);
        add(nextBtn);

        loadQuestion();
        setVisible(true);
    }

    void loadQuestion() {
        question.setText(questions[count][0]);
        o1.setText(questions[count][1]);
        o2.setText(questions[count][2]);
        o3.setText(questions[count][3]);
        o4.setText(questions[count][4]);
        bg.clearSelection();
    }

    public void actionPerformed(ActionEvent e) {
        if (o1.isSelected() && o1.getText().equals(questions[count][5])) score++;
        if (o2.isSelected() && o2.getText().equals(questions[count][5])) score++;
        if (o3.isSelected() && o3.getText().equals(questions[count][5])) score++;
        if (o4.isSelected() && o4.getText().equals(questions[count][5])) score++;

        count++;
        if (count < questions.length) {
            loadQuestion();
        } else {
            new Score(username, score);
            dispose();
        }
    }
}
