package ru.shishkin.javaLessonModule1.lesson3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class ApplicationLesson3 {
    public static void main(String[] args) {
        int r, g, b;
        int x, y, x1, y1;
        Random rnd = new Random();

        for (int i = 0; i < 50; i++) {
            x = rnd.nextInt(200);
            y = rnd.nextInt(200);
            x1 = 1000 + rnd.nextInt(200);
            y1 = 400 + rnd.nextInt(200);

            JFrame window = new JFrame("Frame: " + i);
            window.setBounds(x, y, x1, y1);
            window.setUndecorated(true);

            r = rnd.nextInt(255);
            g = rnd.nextInt(255);
            b = rnd.nextInt(255);

            JPanel panel = new JPanel();
            panel.setBackground(new Color(r, g, b));

            window.add(panel);
            window.setVisible(true);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
