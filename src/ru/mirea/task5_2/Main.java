package ru.mirea.task5_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame{
    public static void main(String[] args) {
     new Main();


    }
    private Round round = new Round();
    private Rectangle rectangle = new Rectangle();
    private Line line = new Line();
    public Main()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,350);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));
        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Random rand = new Random();
        for (int i = 0; i < 20; i++)
        {
            int var = rand.nextInt(0, 3);
            switch (var)
            {
                case 0:
                    round.setCoords();
                    round.setRgbRound();
                    round.draw(g);
                case 1:
                    rectangle.setCoords();
                    rectangle.setRgbRound();
                    rectangle.draw(g);
                case 2:
                    line.setCoords();
                    line.setRgbRound();
                    line.draw(g);
            }
        }

    }
}
