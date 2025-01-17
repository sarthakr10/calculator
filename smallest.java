package calculator;

public class smallest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int min = smallest(num1, num2, num3);
        System.out.println("The smallest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + min);
    }

    public static int smallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
