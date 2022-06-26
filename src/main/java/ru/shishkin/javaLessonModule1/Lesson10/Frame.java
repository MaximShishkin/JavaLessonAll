package Lesson10;

import javax.swing.JFrame;

public class Frame extends JFrame {
	// конструктор класса
	Frame () {
		// название
		setTitle("Stark Vs Tanos");
	    // устанавливаем размеры окна
		setBounds(10, 10, 1300, 700);				
		// добавляем панель к окну
		add(new Panel());			
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
