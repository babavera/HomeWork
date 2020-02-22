package by.verameichyk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сторону a ");
        a = scan.nextDouble();
        System.out.print("Введите сторону b ");
        b = scan.nextDouble();
        System.out.print("Введите радиус окружности r ");
        r = scan.nextDouble();
        if ((r * r) / 2 >= (a * a) + (b * b)) {
            System.out.println("Круг радиусом " + r + " закроет прямоугольик со сторонами a = " + a + " и b = " + b);
        } else {
            {
                System.out.println("Круг радиусом " + r + " не закроет прямоугольик со сторонами a = " + a + " и b = " + b);
            }
        }
    }
}