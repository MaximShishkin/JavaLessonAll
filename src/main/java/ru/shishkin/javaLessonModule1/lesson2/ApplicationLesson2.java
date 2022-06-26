package ru.shishkin.javaLessonModule1.lesson2;

public class ApplicationLesson2 {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 10;
        System.out.println(a + b);

        double a1, b1;
        a1 = 5.5;
        b1 = 10.1;
        System.out.println(a1 + b1);

        String str = "�����-�� �����";
        System.out.println(str + (a + b) + (a1 + b1));

        double rnd = Math.random();
        System.out.println("�������� �������� = " + rnd);
		/*
		if(rnd > 0.7) {
			System.out.println("��, ��������� ����� ������������� ������ 0.7!");
		}
		else if(rnd < 0.4) {
			System.out.println("C�������� ����� ��������� ������ 0.4!");
		}
		else {
			System.out.println("C�������� ����� ��������� � ���������� ����� 0.4-0.7!");
		}
		*/

        for (int i = 0; i < 10000; i++) {
            System.out.println("����" + i);
            System.out.println("�������� �������� = " + Math.random() * 100);
        }
    }
}