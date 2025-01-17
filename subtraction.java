package calculator;

public class subtraction {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int difference = subtract(num1, num2);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
