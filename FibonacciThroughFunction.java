import java.util.*;

public class FibonacciThroughFunction {
    public static void main(String[] args) {
        int x = fibonacciNumber();
        System.out.print(x);
    }

    public static int fibonacciNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = 0;
        for(int i = 1; i<n; i++){
            fib = fib + i;
        }
        return fib;

    }
}
