package ru.shishkin.javaLessonModule1.lesson6;

import javax.swing.JFrame;

public class FrameLesson6 extends JFrame {
    // конструктор класса
    FrameLesson6() {
        // название
        setTitle("Прикольная заставка");
        // устанавливаем размеры окна
        setBounds(10, 10, 1300, 700);
        // добавляем панель к окну
        add(new PanelLesson6());
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
