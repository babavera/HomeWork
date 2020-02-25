package by.verameichyk;

public class Main {

    public static void main(String[] args) {
        int x;
        x = 1245;
        String str;
        if (x % 10  == 1 && x % 100 != 11 && x != 11) {
            str = "ь";
        } else if (x % 10  == 2 && x % 100 != 12 && x != 12) {
            str = "я";
        } else if (x % 10  == 3 && x % 100 != 13 && x != 13) {
            str = "я";
        } else if (x % 10  == 4 && x % 100 != 14 && x != 14) {
            str = "я";
        } else str = "ей";

        System.out.println(x + " рубл" + str);
    }
}
