
package assignment2.java1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment2Java1 extends JFrame
        implements ActionListener {

    private JRadioButton bird, cat, dog, rabbit, pig;
    private ButtonGroup petGroup;

    public Assignment2Java1() {

        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Choose Your Favourite Pet");
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        add(heading, BorderLayout.NORTH);

        JPanel petPanel = new JPanel();
        petPanel.setLayout(new GridLayout(5, 1));

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        petGroup = new ButtonGroup();
        petGroup.add(bird);
        petGroup.add(cat);
        petGroup.add(dog);
        petGroup.add(rabbit);
        petGroup.add(pig);

        petPanel.add(bird);
        petPanel.add(cat);
        petPanel.add(dog);
        petPanel.add(rabbit);
        petPanel.add(pig);

        add(petPanel, BorderLayout.CENTER);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JRadioButton selected =
                (JRadioButton) e.getSource();

        JOptionPane.showMessageDialog(
                this,
                "You selected: " + selected.getText(),
                "Pet Selection",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new Assignment2Java1()
        );
    }
}
