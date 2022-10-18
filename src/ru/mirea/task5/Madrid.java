package ru.mirea.task5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Madrid implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        madrid++;
    }
    int madrid = 0;
}
