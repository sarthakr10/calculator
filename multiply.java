package calculator;

public class multiply {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int product = multiplyNumbers(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
