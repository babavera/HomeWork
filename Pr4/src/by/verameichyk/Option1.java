package by.verameichyk;

public class Option1 {
    public static void main(String[] args) {
        double a, b, d, r;
        a = 10;
        b = 20;
        r = 11.18034;
        d = 2 * r;
        if ((d * d) >= (a * a) + (b * b)) {
            System.out.println("Круг радиусом " + r + " закроет прямоугольик со сторонами a = " + a + " и b = " + b);
        } else {
            System.out.println("Круг радиусом " + r + " не закроет прямоугольик со сторонами a = " + a + " и b = " + b);
        }
    }
}
