package ru.mirea.task5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Milan implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        milan++;
    }
    int milan = 0;
}
