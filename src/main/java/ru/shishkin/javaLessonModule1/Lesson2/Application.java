package Lesson2;

public class Application {
	// точка входа
	public static void main(String[] args) {
		
		// целочисленный тип данных
		int a, b;
		// присваиваем значение переменной
		a = 5;
		b = 10;
		//  вывод значени€ переменной
		System.out.println(a + b);
		
		// дробный тип данных
		double a1, b1;
		a1 = 5.5;
		b1 = 10.1;
		System.out.println(a1 + b1);
		
		// символьный тип танных
		String str = "какой-то текст";
		System.out.println(str + (a + b) + (a1 + b1));
		
		// блок условий
		double rnd = Math.random();
		System.out.println("—лучайно значение = " + rnd);
		/*
		if(rnd > 0.7) {
			System.out.println("ƒа, случайное число действительно больше 0.7!");
		}
		else if(rnd < 0.4) {
			System.out.println("Cлучайное число оказалось меньше 0.4!");
		}
		else {
			System.out.println("Cлучайное число оказалось в промежутке между 0.4-0.7!");
		}
		*/
		
		// i++ одно и тоже что i = i + 1
		// i+=3 одно и тоже что i = i + 3
		// цикл for
		for(int i = 0; i < 10000; i++) {
			System.out.println("Ўаги" + i);
			System.out.println("—лучайно значение = " + Math.random() * 100);
		}
	}
}