package by.verameichyk;

import java.util.Scanner;

public class option2 {

    public static void main(String[] args) {    
        int i;
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
