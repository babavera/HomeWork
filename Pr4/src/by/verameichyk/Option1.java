package by.verameichyk;

public class Option1 {
    public static void main(String[] args) {
        double a, b, r, d;
        a = 10;
        b = 20;
        d = 22.4;
        if ((d * d) >= (a * a) + (b * b)) {
            System.out.println("Круг радиусом " + (d / 2) + " закроет прямоугольик со сторонами a = " + a + " и b = " + b);
        } else {
            System.out.println("Круг радиусом " + (d / 2) + " не закроет прямоугольик со сторонами a = " + a + " и b = " + b);
        }
    }
}
