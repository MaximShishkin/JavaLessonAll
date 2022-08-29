package ru.shishkin.javaLesson.lesson4;

import javax.swing.*;
import java.awt.*;

class FrameLesson4 extends JFrame {
    public FrameLesson4() {
        setBounds(0, 0, 800, 600);
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        PanelLesson4 pan = new PanelLesson4();
        Container con = getContentPane();
        con.add(pan);
        setVisible(true);
    }
}
