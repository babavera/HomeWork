package by.verameichyk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введиет количество учеников ");
        int [] marks = new int [scanner.nextInt()];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Введите оценку ученика " + (i + 1) + " ");
            marks[i] = scanner.nextInt();
            boolean t = false;
            while (t == false) {
                if (marks[i] <= 0 || marks[i] > 10) {
                    t = false;
                    System.out.print("Недопустимая оценка, введите оценку ученику " + (i + 1) + " от 1 до 10 ");
                    marks[i] = scanner.nextInt();
                } else {
                    t = true;
                }
            }
        }
        int maxMark = 0;
        for (int mark : marks) {
            if (maxMark < mark) {
                maxMark = mark;
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxMark) {
            int index = i + 1;
            System.out.println("Максимальная оценка " + maxMark + " у ученика " + (index));
            }
        }
    }
}
