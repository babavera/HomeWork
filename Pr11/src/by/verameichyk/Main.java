package by.verameichyk;

public class Main {

    public static void main(String[] args) {
	    int i;
        int x = 1753;
        boolean primeNumber = false;
	    for (i = 2; i < x; i++) {
	        if (x % i == 0) {
                primeNumber = true;
                break;
            } else {
                primeNumber = false;
            }
        }
        if (!primeNumber) {
            System.out.println("Число " + x + " простое");

        }  else {
            System.out.println("Число " + x + " составное");
        }

    }
}
