package by.verameichyk;

public class option1 {
    public static void main(String[] args) {
        int i = -7;
        if (Math.abs(i) % 10 == 7) {
            System.out.println("Последняя цифра числа " + i + " является 7");
        } else {
            System.out.println("Последняя цифра числа " + i + " не является 7");
        }
    }
}
