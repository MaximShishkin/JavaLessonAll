package ru.shishkin.javaLesson.lesson7;

import javax.swing.*;
import java.awt.*;

public class FrameLesson7 extends JFrame {
    public FrameLesson7() {
        PanelLesson7 np = new PanelLesson7();
        Container cont = getContentPane();
        cont.add(np);
        setBounds(0, 0, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
