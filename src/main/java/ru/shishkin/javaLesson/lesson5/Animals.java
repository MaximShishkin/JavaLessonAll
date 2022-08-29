package ru.shishkin.javaLesson.lesson5;

public class Animals {
    double ves;
    String vid;
    double rost;
    double dlina;
    String clichka;

    Animals(String name) {
        clichka = name;
    }

    void go(double x) {
        if (x > 10) {
            System.out.println("����� ���� ������ ������� ��� �������� �� ����� " + clichka);
        } else {
            System.out.println("��, �� �� �����, ����� ���� ������� " + clichka + " � �������");
        }
    }
}
