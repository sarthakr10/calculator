package calculator;

public class largest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int max = findLargest(num1, num2, num3);
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
    }

    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
}
