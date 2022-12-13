package ru.mirea.task5;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {

    static int madrid_goal = 0;
    static int milan_goal = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,350);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));


        JLabel name_count = new JLabel("Ереванский Динамо  Бакинский Спартак");
        name_count.setBounds(535,10,500,100);
        name_count.setFont(new Font("Arial", Font.PLAIN, 25));
        name_count.setForeground(Color.BLUE);
        frame.add(name_count);

        JLabel count = new JLabel(madrid_goal + ":" + milan_goal);
        count.setBounds(750,40,100,100);
        count.setFont(new Font("Arial", Font.PLAIN, 25));
        frame.add(count);

        JLabel winner = new JLabel("Ведёт N/A");
        winner.setBounds(710,100,500,100);
        winner.setFont(new Font("Arial", Font.PLAIN, 25));
        winner.setForeground(Color.RED);
        frame.add(winner);

        JButton madridButton = new JButton("Ереванский Динамо");
        JButton milanButton = new JButton("Бакинский Спартак");
        JButton reset = new JButton("RESET");

        madridButton.setBounds(400,200,300,80);
        madridButton.setFont(new Font("Arial", Font.PLAIN, 25));
        madridButton.setBackground(Color.ORANGE);
        frame.add(madridButton);

        milanButton.setBounds(900,200,300,80);
        milanButton.setFont(new Font("Arial", Font.PLAIN, 25));
        milanButton.setBackground(Color.GREEN);
        frame.add(milanButton);

        reset.setBounds(725,200,150,80);
        reset.setFont(new Font("Arial", Font.PLAIN, 25));
        reset.setBackground(Color.GRAY);
        frame.add(reset);

        JLabel labelLast = new JLabel("Вах, какой гол забивает: ");
        labelLast.setBounds(250,300,700,100);
        labelLast.setFont(new Font("Arial", Font.PLAIN, 25));
        labelLast.setBackground(Color.RED);
        frame.add(labelLast);

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madrid_goal++;
                count.setText(madrid_goal + ":" + milan_goal);
                labelLast.setText("Вах, какой гол забивает: Ереванский Динамо!!!");
                if (madrid_goal > milan_goal) {
                    winner.setText("Ведёт: Ереванский Динамо");
                } else {
                    if (milan_goal > madrid_goal) {
                        winner.setText("Ведёт: Бакинский Спартак");
                    } else {
                        winner.setText("Ничья");
                    }
                }
            }
        });

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milan_goal++;
                labelLast.setText("Вах, какой гол забивает: Бакинский Спартак!!!");
                count.setText(madrid_goal + ":" + milan_goal);
                if (madrid_goal > milan_goal) {
                    winner.setText("Ведёт: Ереванский Динамо");
                } else {
                    if (milan_goal > madrid_goal) {
                        winner.setText("Ведёт: Бакинский спартак");
                    } else {
                        winner.setText("Ничья");
                    }
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelLast.setText("Нихто нэ забивает");
                madrid_goal = 0;
                milan_goal = 0;
                count.setText(madrid_goal + ":" + milan_goal);
                winner.setText("Winner: N/A");
            }
        });


        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
