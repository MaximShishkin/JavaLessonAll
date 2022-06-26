package Lesson10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel {
	// для получения целых случайных значений
	private Random random = new Random();
	
	// координаты 
	private int x1 = 10;
	private int y1 = 10;
	private int x2 = 1125;
	private int y2 = 10;
	private int xglove = 200 + random.nextInt(850);
	private int yglove = 200 + random.nextInt(250);

	// направление движения
	private int direction1 = 3;
	private int direction2 = 5;
	// скорость
	private int speed1 = 5;
	private int speed2 = 5;
	// счёт игры
	private int score1 = 0;
	private int score2 = 0;
	// победитель
	// 0 - идёт игра 
	// 1 - победил танос
	// 2 - победил старк
	private int winner = 0;
	
	// таймер
	private Timer timer;
	
	// картинки
	private Image tanos;
	private Image stark;
	private Image fon;
	private Image glove;
	
	// класс для обработки событий клавиатуры
	private class myKey implements KeyListener {
		public void keyTyped(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}

		public void keyPressed(KeyEvent e) {
			int keyNumber = e.getKeyCode();
			System.out.println(keyNumber);
			// ================================================================================
			if(keyNumber == 69) { // E
				direction1 = 1;
			} else if (keyNumber == 68) { // D
				direction1 = 2;
			} else if (keyNumber == 67) { // C
				direction1 = 3;
			} else if (keyNumber == 83) { // S
				direction1 = 4;
			} else if (keyNumber == 90) { // Z
				direction1 = 5;
			} else if (keyNumber == 65) { // A
				direction1 = 6;
			} else if (keyNumber == 81) { // Q
				direction1 = 7;
			} else if (keyNumber == 87) { // W
				direction1 = 8;
			} 
			// ================================================================================
			// ================================================================================
			if(keyNumber == 105) { // 9
				direction2 = 1;
			} else if (keyNumber == 102) { // 6
				direction2 = 2;
			} else if (keyNumber == 99) { // 3
				direction2 = 3;
			} else if (keyNumber == 98) { // 2
				direction2 = 4;
			} else if (keyNumber == 97) { // 1
				direction2 = 5;
			} else if (keyNumber == 100) { // 4
				direction2 = 6;
			} else if (keyNumber == 103) { // 7
				direction2 = 7;
			} else if (keyNumber == 104) { // 8
				direction2 = 8;
			} 
			// ================================================================================
			// перезапуск игры
			if(keyNumber == 10 && winner > 0) {
				// координаты 
				x1 = 10;
				y1 = 10;
				x2 = 1125;
				y2 = 10;
				xglove = 200 + random.nextInt(850);
				yglove = 200 + random.nextInt(250);

				// направление движения
				direction1 = 3;
				direction2 = 5;
				// скорость
				speed1 = 5;
				speed2 = 5;
				// счёт игры
				score1 = 0;
				score2 = 0;
				// победитель
				// 0 - идёт игра 
				// 1 - победил танос
				// 2 - победил старк
				winner = 0;
				
				// запуск таймера
				timer.start();
			}
			// выход из игры
			if(keyNumber == 27 && winner > 0) {
				System.exit(0);
			}
		}
	}
	
	// конструктор класса
	Panel () {
		addKeyListener(new myKey());
		setFocusable(true);
		
		try {
			tanos = ImageIO.read(Panel.class.getResource("1.png"));
			stark = ImageIO.read(Panel.class.getResource("2.png"));
			fon = ImageIO.read(Panel.class.getResource("3.jpg"));
			glove = ImageIO.read(Panel.class.getResource("4.png"));
			System.out.println("Картинки добавились!");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
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
		// шрифт
		Font font = new Font("Verdana",Font.BOLD, 20);
		g.setFont(font);
		
		// отрисовываем картинки
		g.drawImage(fon, 0, 0, 1300, 700, null);
		g.drawImage(tanos, x1, y1, 150, 150, null);
		g.drawImage(stark, x2, y2, 150, 150, null);
		g.setColor(Color.YELLOW);
		g.fillOval(xglove, yglove, 50, 50);
		g.drawImage(glove, xglove, yglove, 50, 50, null);
		// метод для проверки игры
		test();
		
		g.setColor(Color.RED);
		g.drawString("Stark - " + score2, 1160, 30);
		g.setColor(Color.BLUE);
		g.drawString("Tanos - " + score1, 20, 30);
		
		// отрисовка победителя
		if (winner == 1) {
			g.setColor(Color.BLUE);
			g.drawString("WINNER!", x1 + 20, y1 + 75);
			g.drawString("LOSER!", x2 + 20, y2 + 75);
			g.drawString("ESC = EXIT, ENTER = RESTART", 20, 640);
		}
		if (winner == 2) {
			g.setColor(Color.RED);
			g.drawString("WINNER!", x2 + 20, y2 + 75);
			g.drawString("LOSER!", x1 + 20, y1 + 75);
			g.drawString("ESC = EXIT, ENTER = RESTART", 20, 640);
		}
	}	
	
	// метод для проверки игры
	protected void test() {
		// проверка таноса
		if(x1 - 50 < xglove && xglove < x1 + 150 && y1 - 50 < yglove && yglove < y1 + 150) {
			score1++;
			speed1++;
			xglove = 200 + random.nextInt(850);
			yglove = 200 + random.nextInt(250);
		}
		
		// проверка старка
		if(x2 - 50 < xglove && xglove < x2 + 150 && y2 - 50 < yglove && yglove < y2 + 150) {
			score2++;
			speed2++;
			xglove = 200 + random.nextInt(850);
			yglove = 200 + random.nextInt(250);
		}
		
		// конец игры
		if(score1 + score2 > 50) {
			// останавливаем таймер
			timer.stop();
			
			if(score1 > score2) {
				winner = 1;
			} else {
				winner = 2;
			}
		}
	}
}
