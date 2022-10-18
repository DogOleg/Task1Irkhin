package ru.mirea.task5;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(200, 300));
        JButton milan = new JButton("AC Milan");
        ActionListener actionListener = new Milan();
        milan.addActionListener(actionListener);
        frame.getContentPane().add(milan);

        JButton madrid = new JButton("Madrid");
        ActionListener actionListener_1 = new Madrid();
        madrid.addActionListener(actionListener_1);
        frame.getContentPane().add(madrid);
    }
}
