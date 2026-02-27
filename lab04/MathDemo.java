package lab04;

public class MathDemo {

    // a. Min method
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // b. Max method
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // c. Sum of elements
    public static int sum(int[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s = s + args[i];
        }
        return s;
    }

    // d. Average calculation
    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        float total = (float) sum(args);
        return total / args.length;
    }

    // e. Factorial with loop
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    
    public static void main(String[] args) {

        int[] testData = {5, 10, 15};

        System.out.println("Sum result: " + sum(testData));
        System.out.println("Factorial of 5: " + factorial(5));
        
    }
}
    

