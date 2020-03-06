package by.verameichyk;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Введите сумму ");
        x = scan.nextInt();
        String str;
        if (x % 10  == 1 && x % 100 != 11 && x != 11) {
            str = "ь";
        } else if (x % 10  == 2 && x % 100 != 12 && x != 12) {
            str = "я";
        } else if (x % 10  == 3 && x % 100 != 13 && x != 13) {
            str = "я";
        } else if (x % 10  == 4 && x % 100 != 14 && x != 14) {
            str = "я";
        } else str = "ей";

        System.out.println(x + " рубл" + str);
    }
}
