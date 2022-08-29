package ru.shishkin.javaLesson.lesson6;

import javax.swing.*;
import java.awt.*;

class PanelLesson6 extends JPanel {
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        for (int i = 0; i <= 40; i++) {
            gr.setColor(Color.blue);
            gr.fillRect(i * 40, 0, 20, 20);
        }

        for (int i = 0; i <= 40; i++) {
            gr.setColor(Color.RED);
            gr.fillRect(20 + i * 40, 0, 20, 20);
        }

        for (int i = 0; i <= 40; i++) {
            gr.setColor(Color.red);
            gr.fillRect(i * 40, 20, 20, 20);
        }

        for (int i = 0; i <= 40; i++) {
            gr.setColor(Color.blue);
            gr.fillRect(20 + i * 40, 20, 20, 20);
        }
    }
}