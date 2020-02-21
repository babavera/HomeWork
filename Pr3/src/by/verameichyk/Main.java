package by.verameichyk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    // можно было через if (((x - 7) + 5) % 5 = 0), но тогда теряются
        int i;                                  // дробные и отрицательные варианты чисел (в условаии не уточнено), поэтому решил строками
        String str;
        char a;
        System.out.print("Введите число ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        i = str.length() - 1;
        a = str.charAt(i);
        if (a == '7'){
            System.out.println("Последний символ числа " + str + " является 7");
        } else {
            System.out.println("Последний символ числа " + str + " не является 7");
        }

    }
}
