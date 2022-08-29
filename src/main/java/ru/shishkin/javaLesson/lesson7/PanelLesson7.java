package ru.shishkin.javaLesson.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelLesson7 extends JPanel {
    private int x = 0, y = 0;
    private int napr = 2;
    private Image img;

    private class myKey implements KeyListener {
        public void keyPressed(KeyEvent e) {
            int key_ = e.getKeyCode();
            if (key_ == 37) napr = 0;
            if (key_ == 39) napr = 2;
            if (key_ == 38) napr = 1;
            if (key_ == 40) napr = 3;
            if (key_ == 32) napr = 4;
        }

        public void keyReleased(KeyEvent e) {}
        public void keyTyped(KeyEvent e) {}
    }

    public PanelLesson7() {
        addKeyListener(new myKey());
        setFocusable(true);

        try {
            // img = ImageIO.read(new File("c:\\planeta.png"));
        } catch (Exception exp) {
            exp.printStackTrace();
        }

        Timer nt = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (napr == 0) x--;
                if (napr == 1) y--;
                if (napr == 2) x++;
                if (napr == 3) y++;
                if (x > 800) x = -300;
                if (x < 0) napr = 2;
                if (y < 0) napr = 3;
                if (y > 300) napr = 1;
                repaint();
            }
        });
        nt.start();
    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.drawImage(img, x, y, 300, 300, null);
        gr.drawImage(img, 100, 100, 300, 300, null);
    }
}
