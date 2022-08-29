package ru.shishkin.javaLesson.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class PanelLesson4 extends JPanel {

    public class myMouse1 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
    }

    public class myMouse2 implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
        }
    }

    public PanelLesson4() {
        addMouseListener(new myMouse1());
        addMouseMotionListener(new myMouse2());
        setFocusable(true);
    }

    public void paintComponent(Graphics gr) {
    }
}
