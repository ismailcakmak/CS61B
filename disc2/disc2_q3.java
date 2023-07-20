package disc2;

public class disc2_q3 {

    /**
     * This is iterative fibonacci function
     */

    public static int fib(int n) {

        int first = 0 ;
        int second = 1;

        if(n==1) return first; // if user want to get first fibonacci number
        if(n==2) return second; // if user want to get first fibonacci number

        for(int i=2; i<n; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;

    }


    /**
     * This is recursive fibonacci function
     */
    public static int fib2(int n, int f0, int f1) {


        if(n == 2)
            return f1;

        return fib2(n-1, f1, f0+f1);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib2(6,0,1));
    }



}
