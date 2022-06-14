package Lesson3;

// библиотека
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class Frame {

	public static void main(String[] args) {
		// случайные значения цвета окна
		int r, g, b;
		// случайные значения для расположения окна
		int x, y, x1, y1;
		Random rnd = new Random();
		
		// цикл из 10 окон
		for(int i = 0; i < 50; i++) {
			// создание случайных размеров для окна
			x = rnd.nextInt(200);
			y = rnd.nextInt(200);
			x1 = 1000 + rnd.nextInt(200);
			y1 = 400 + rnd.nextInt(200);
				
			// создаётся объект окна
			JFrame window = new JFrame("Моё окно под номером: " + i);
			// window.setTitle("Моё первое окно");
			// устанавливаем размер окна (x,y,x1,y1)
			window.setBounds(x, y, x1, y1);
			// убираем рамку окна
			window.setUndecorated(true);
			
			// создаём случайный цвет
			r = rnd.nextInt(255);
			g = rnd.nextInt(255);
			b = rnd.nextInt(255);
			
			// создать объект панели
			JPanel panel = new JPanel();
			// добавляем цвет панели
			panel.setBackground(new Color(r,g,b));
			// добавляем панель в окно
			window.add(panel);
			
			// сделать окно видимым для нас
			window.setVisible(true);
			// очищаем память при закрытии окна
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}
