package by.verameichyk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int x = scanner.nextInt();
        boolean primeNumber = true;
	    for (int i = 2; i < x; i++) {
	        if (x % i == 0) {
                primeNumber = false;
                break;
            } else {
                primeNumber = true;
            }
        }
        if (primeNumber) {
            System.out.println("Число " + x + " простое");

        }  else {
            System.out.println("Число " + x + " составное");
        }

    }
}
