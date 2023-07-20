package timingtest;

/**
 * Created by hug.
 */
public class StopwatchDemo {
    /** Computes the nth Fibonacci number using a slow naive recursive strategy.*/
    private static int fib(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int fib41 = fib(41);
        System.out.println("The 50th fibonacci number is " + fib41);
    }
}
