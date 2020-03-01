package by.verameichyk;

public class Main {

    public static void main(String[] args) {
        int i = 1234567890;
        System.out.print("Сумма цифр числа " + i);
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(" равна " + sum);
    }
}
