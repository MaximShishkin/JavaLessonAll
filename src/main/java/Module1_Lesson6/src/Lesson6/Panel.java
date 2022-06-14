package Lesson6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel {
	// координаты 
	private int x1 = 10;
	private int y1 = 10;
	private int x2 = 1125;
	private int y2 = 10;
	// направление движения
	private int direction1 = 3;
	private int direction2 = 5;
	// скорость
	private int speed1 = 5;
	private int speed2 = 5;

	// таймер
	private Timer timer;
	
	// цвет
	private Color color1 = Color.BLUE;
	private Color color2 = Color.RED;
	private Color colorRect = Color.BLACK;
	
	// конструктор класса
	Panel () {
		// для случайных значений
		Random rnd = new Random();
		
		// создаём и описываем таймер
		timer = new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ================================================================================
				// управление 1 шариком
				// правая грань
				if (x1 > 1135) {
					if (direction1 == 2) {
						direction1 = 6;
					} else if (direction1 == 3) {
						direction1 = 5;
					} else if (direction1 == 1) {
						direction1 = 7;
					}
					color1 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// левая грань
				if (x1 < 0) {
					if (direction1 == 6) {
						direction1 = 2;
					} else if (direction1 == 5) {
						direction1 = 3;
					} else if (direction1 == 7) {
						direction1 = 1;
					}
					color1 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// верхняя грань
				if(y1 < 0) {
					if (direction1 == 1) {
						direction1 = 3;
					} else if (direction1 == 8) {
						direction1 = 4;
					} else if (direction1 == 7) {
						direction1 = 5;
					}
					color1 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// нижняя грань
				if(y1 > 510) {
					if(direction1 == 3) {
						direction1 = 1;
					} else if (direction1 == 4) {
						direction1 = 8;
					} else if (direction1 == 5) {
						direction1 = 7;
					}
					color1 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				
				if(direction1 == 1) {
					x1 = x1 + speed1;
					y1 = y1 - speed1;
				} else if (direction1 == 2) {
					x1 = x1 + speed1;
				} else if (direction1 == 3) {
					x1 = x1 + speed1;
					y1 = y1 + speed1;
				} else if (direction1 == 4) {
					y1 = y1 + speed1;
				} else if (direction1 == 5) {
					x1 = x1 - speed1;
					y1 = y1 + speed1;
				} else if (direction1 == 6) {
					x1 = x1 - speed1;
				} else if (direction1 == 7) {
					x1 = x1 - speed1;
					y1 = y1 - speed1;
				} else if (direction1 == 8) {
					y1 = y1 - speed1;
				}
				// ================================================================================
				// ================================================================================
				// управление 2 шариком
				// правая грань
				if (x2 > 1135) {
					if (direction2 == 2) {
						direction2 = 6;
					} else if (direction2 == 3) {
						direction2 = 5;
					} else if (direction2 == 1) {
						direction2 = 7;
					}
					color2 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// левая грань
				if (x2 < 0) {
					if (direction2 == 6) {
						direction2 = 2;
					} else if (direction2 == 5) {
						direction2 = 3;
					} else if (direction2 == 7) {
						direction2 = 1;
					}
					color2 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// верхняя грань
				if(y2 < 0) {
					if (direction2 == 1) {
						direction2 = 3;
					} else if (direction2 == 8) {
						direction2 = 4;
					} else if (direction2 == 7) {
						direction2 = 5;
					}
					color2 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				// нижняя грань
				if(y2 > 510) {
					if(direction2 == 3) {
						direction2 = 1;
					} else if (direction2 == 4) {
						direction2 = 8;
					} else if (direction2 == 5) {
						direction2 = 7;
					}
					color2 = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
					colorRect = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
				}
				
				if(direction2 == 1) {
					x2 = x2 + speed2;
					y2 = y2 - speed2;
				} else if (direction2 == 2) {
					x2 = x2 + speed2;
				} else if (direction2 == 3) {
					x2 = x2 + speed2;
					y2 = y2 + speed2;
				} else if (direction2 == 4) {
					y2 = y2 + speed2;
				} else if (direction2 == 5) {
					x2 = x2 - speed2;
					y2 = y2 + speed2;
				} else if (direction2 == 6) {
					x2 = x2 - speed2;
				} else if (direction2 == 7) {
					x2 = x2 - speed2;
					y2 = y2 - speed2;
				} else if (direction2 == 8) {
					y2 = y2 - speed2;
				}
				// ================================================================================
				
				// переотрисовать панель
				repaint();
			}
		});
		// запуск таймера
		timer.start();
	}
	
	// метод для отрисовки графики
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(colorRect);
		g.fillRect(0, 0, 1300, 700);
		// выбираем цвет
		g.setColor(color1);
		// отрисуем овал
		g.fillOval(x1, y1, 150, 150);
		g.setColor(color2);
		// отрисуем овал
		g.fillOval(x2, y2, 150, 150);
	}	
}
