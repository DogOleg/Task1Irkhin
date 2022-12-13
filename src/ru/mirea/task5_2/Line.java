package ru.mirea.task5_2;

import java.awt.*;
import java.util.Random;

public class Line extends Shape{
    Random rand = new Random();
    public void setRgbRound()
    {
        r = rand.nextInt(1,255);
        g = rand.nextInt(1, 255);
        b = rand.nextInt(1, 255);
    }
    public void setCoords()
    {
        x = rand.nextInt(0, 1000);
        y = rand.nextInt(0, 1000);
        line = rand.nextInt(50, 100);
        height = rand.nextInt(50, 100);
    }
    public void draw(Graphics g)
    {
        g.setColor(new Color(r, this.g, b));
        g.drawLine(x, y, line, height);

    }
}
