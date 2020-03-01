package by.verameichyk;

public class Main {

    public static void main(String[] args) {
        int maxNum = 0;
        int n = 0;
        int x = (int)(Math.random() * 20) ;
        while (x != 0) {
            x = (int)(Math.random() * 20);
            if (x >= maxNum) {
                maxNum = x;
            } else {
            }
            n++;
            System.out.println(x);
        }
        System.out.println("Максимальное " + maxNum);
    }
}
