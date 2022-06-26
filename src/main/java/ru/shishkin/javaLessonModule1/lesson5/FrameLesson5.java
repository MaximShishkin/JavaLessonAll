package ru.shishkin.javaLessonModule1.lesson5;

// библиотеки
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class FrameLesson5 {
    // точка входа
    public static void main(String[] args) {
        // переменные для получения случайных размеров окна
        int x, y, x1, y1;
        Random rnd = new Random();

        // цикл из 10 окошек
        for (int i = 0; i < 10; i++) {
            // создание случайных размеров окна
            x = rnd.nextInt(200);
            y = rnd.nextInt(200);
            x1 = 1000 + rnd.nextInt(200);
            y1 = 400 + rnd.nextInt(200);

            // создаётся объект окна
            JFrame window = new JFrame();
            // устанавливаем размеры окна
            window.setBounds(x, y, x1, y1);
            // убираем рамку окна
            window.setUndecorated(true);

            // добавляем панель к окну
            window.add(new PanelLesson5());

            // делаем окно видимым для нас
            window.setVisible(true);
            // закрытие приложения
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // отправляем курсор мышки в левый верхний угол
            try {
                Robot rob = new Robot();
                rob.mouseMove(0, 0);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
