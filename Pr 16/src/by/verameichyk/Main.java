package by.verameichyk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива ");
        int [] mass = new int [scanner.nextInt()];
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass));

        int n = mass.length;
        int x;
        for (int i = 0; i < n / 2; i++){
            x = mass[n - 1 - i];
            mass[n - 1 - i] = mass[i];
            mass[i] = x;
        }
        System.out.println("Перевернутый массив");
        System.out.println(Arrays.toString(mass));
    }
}
