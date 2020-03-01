package by.verameichyk;

public class Main {

    public static void main(String[] args) {
        boolean t;
        int a, b, c, d, e, f;
        a = 4;
        b = 1;
        c = 3;
        d = 4;
        e = 4;
        f = 4;
        if (b + c <= e && a <= f && d <= f ) {
            t = true;
        } else {
            if (b + c <= f && a <= e && d <= e) {
                t = true;
            } else {
                if (a + c <= e && b <= f && d <= f) {
                    t = true;
                } else {
                    if (a + c <= f && b <= e && d <= e) {
                        t = true;
                    } else {
                        t = false;
                    }
                }
            }
        }
        if (t) {
            System.out.println("Дома размерами а = " + a + " на b = " + b + " и с = " + c + " на d = " + d +
                    " поместятся на участке e = " + e + " на f = " + f);
        } else {
            System.out.println("Дома размерами а = " + a + " на b = " + b + " и с = " + c + " на d = " + d +
                    "  не поместятся на участке e = " + e + " на f = " + f);
        }
    }
}
