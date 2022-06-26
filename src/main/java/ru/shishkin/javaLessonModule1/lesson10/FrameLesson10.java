package ru.shishkin.javaLessonModule1.lesson10;

import javax.swing.JFrame;

public class FrameLesson10 extends JFrame {
    // конструктор класса
    FrameLesson10() {
        // название
        setTitle("Stark Vs Tanos");
        // устанавливаем размеры окна
        setBounds(10, 10, 1300, 700);
        // добавляем панель к окну
        add(new PanelLesson10());
        // запретить изменять рамки окна
        setResizable(false);
        // закрытие приложения
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // убираем рамки окна
        // setUndecorated(true);
        // делаем окно видимым для нас
        setVisible(true);
    }
}
