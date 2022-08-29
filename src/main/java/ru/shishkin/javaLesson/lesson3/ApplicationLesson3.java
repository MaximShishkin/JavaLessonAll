package ru.shishkin.javaLesson.lesson3;

import javax.swing.*;

public class ApplicationLesson3 {
    public static void main(String[] args) {
        JFrame wnd2 = new JFrame();
        wnd2.setBounds(125, 100, 100, 100);
        wnd2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd2.setVisible(true);

        JFrame wnd3 = new JFrame();
        wnd3.setBounds(250, 200, 100, 100);
        wnd3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd3.setVisible(true);

        JFrame wnd4 = new JFrame();
        wnd4.setBounds(1, 200, 100, 100);
        wnd4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd4.setVisible(true);

        JFrame wnd5 = new JFrame();
        wnd5.setBounds(250, 1, 100, 100);
        wnd5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd5.setVisible(true);

        for (int i = 0; i < 500; i++) {
            JFrame wnd = new JFrame();
            wnd.setBounds((int) (Math.random() * 1000), (int) (Math.random() * 1000), 100, 100);
            wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wnd.setVisible(true);
        }
    }
}