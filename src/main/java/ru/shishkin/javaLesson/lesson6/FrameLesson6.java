package ru.shishkin.javaLesson.lesson6;

import javax.swing.*;
import java.awt.*;

public class FrameLesson6 extends JFrame {
    public FrameLesson6() {
        PanelLesson6 panel = new PanelLesson6();
        Container cont = getContentPane();
        cont.add(panel);
        setBounds(10, 10, 1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
