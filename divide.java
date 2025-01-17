package calculator;

public class divide {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int quotient = performDivision(num1, num2);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);
    }

    public static int performDivision(int a, int b) {
        return a / b;
    }
}
