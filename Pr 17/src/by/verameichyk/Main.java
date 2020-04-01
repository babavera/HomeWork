package by.verameichyk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадраьного двумерного массива ");
        int n = scanner.nextInt();
        int [][] mass = new int [n][n];
        System.out.println();
        for (int i = 0; i < mass.length / 2 ; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (j < i || j >= mass[i].length - i) {
                    mass [i][j] = 0;
                } else {
                    mass[i][j] = 1;
                }
            }
        }
        for (int i = mass.length - 1; i >= mass.length / 2 ; i--){
            for (int j = 0; j < mass[i].length; j++){
                if (j > i || j < mass[i].length - i - 1) {
                    mass [i][j] = 0;
                } else {
                    mass[i][j] = 1;
                }
            }
        }
        for (int[] ints : mass) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
