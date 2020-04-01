package by.verameichyk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива ");
        int [] nums = new int [scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива : ");
            nums[i] = scanner.nextInt();
        }
        int indexMax = 0;
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                indexMax = i;
            }
        }
        int indexMin = indexMax;
        int minNum = maxNum;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
                indexMin = i;
            }
        }

        int sum = 0;
        if (indexMax > indexMin) {
            for (indexMax--; indexMax != indexMin; indexMax--) {
                sum += nums[indexMax];
            }
        } else {
            if (indexMax < indexMin) {
                for (indexMax++; indexMax != indexMin; indexMax++) {
                    sum += nums[indexMax];
                }
            }
        }

        System.out.println("Сумма элементов массива: " + Arrays.toString(nums) +
                " между максимальным числом " + maxNum + " и минимальным " +
                + minNum + " равна: " + sum);
    }
}
