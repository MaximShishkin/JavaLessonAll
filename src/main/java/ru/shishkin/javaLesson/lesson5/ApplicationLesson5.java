package ru.shishkin.javaLesson.lesson5;

public class ApplicationLesson5 {
    public static void main(String[] args) {
        Animals dog = new Animals("����");
        dog.dlina = 1.5;
        dog.rost = 0.5;
        dog.ves = 25;
        dog.vid = "������";
        dog.go(dog.ves);

        Animals cat = new Animals("���");
        cat.dlina = 0.4;
        cat.rost = 0.2;
        cat.ves = 8;
        cat.vid = "������� ������������";
        cat.go(cat.ves);

        System.out.println("� ���� ���� �������� �������� �� ����� " + dog.clichka + " � " + cat.clichka);

        System.out.println("��� " + dog.clichka + " ������ " + cat.clichka + " �� " + (dog.ves - cat.ves));

        Shark shark = new Shark("������� ����� �����");
        shark.dlina = 5;
        shark.rost = 1;
        shark.ves = 950;
        shark.vid = "���������";
        shark.kolvop = 5;
        shark.kolvoz = 6000;
        shark.mestoo = "��������� �����";

        System.out.println("��� " + shark.clichka + " ������ " + cat.clichka + " �� " + (shark.ves - cat.ves));
        System.out.println("� ���� ���� �������� �������� �� ����� " + dog.clichka + " � " + cat.clichka + ", � ��� �� ���� ��������� ��������, �������� ����� " + shark.clichka);
    }
}
