package by.verameichyk;

public class Main {

    public static void main(String[] args) {
        int x;
        x = 1411;
        String str;
        if (x < 100) {
            if (x != 11 && x % 10  == 1) {
                str = "ь";
            } else if (x != 12 && x % 10 == 2) {
                str = "я";
            } else if (x != 13 && x % 10 == 3) {
                str = "я";
            } else if (x != 14 && x % 10 == 4) {
                str = "я";
            } else str = "ей";
        } else {
            if (x % 100 != 11 && x % 10 == 1) {
                str = "ь";
            } else if (x % 100 != 12 && x % 10 == 2) {
                str = "я";
            } else if (x % 100 != 13 && x % 10 == 3) {
                str = "я";
            } else if (x % 100 != 14 && x % 10 == 4) {
                str = "я";
            } else str = "ей";
        }
            System.out.println(x + " рубл" + str);
    }
}
