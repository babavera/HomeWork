package by.verameichyk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long  s, sec, m, min, h, hour,  d, day, w, week;
        System.out.print("Enter the number ");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLong();
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 60;
        d = (h - hour) / 24;
        day = d % 24;
        w = (d - day) / 7;
        week = w % 7;
        System.out.println( s + " Seconds" + " is " + week + " Weeks " + day + " Days " + hour + " Hours " + min + " Minutes " + sec + " Seconds ");

    }
}
