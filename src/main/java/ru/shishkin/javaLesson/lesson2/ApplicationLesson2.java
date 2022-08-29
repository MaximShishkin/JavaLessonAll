package ru.shishkin.javaLesson.lesson2;

import javax.swing.*;

public class ApplicationLesson2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            JFrame nf = new JFrame();
            nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            nf.setBounds(i * 230, i * 230, 200, 100);
            nf.setVisible(true);
        }
    }
}
