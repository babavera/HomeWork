package by.verameichyk;

public class Main {

    public static void main(String[] args) {
	    int i = 1789325412;
	    int sum = 0;
	    int n = 1;
	    int x = 0;
        int y = 0;
	    while (x != i) {
            x = i % n;
            y = (x * 10) / n;
            n = n * 10;
            sum += y;
        }
        System.out.println("Сумма цифр числа " + i + " равна " + sum);
    }
}
