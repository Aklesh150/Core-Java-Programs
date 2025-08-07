import java.util.*;

public class FactorialThroughFunction {

    public static void main(String[] args) {
        int x = factorialNumber();
        System.out.print(x);
    }

    public static int factorialNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact = fact*i;
        }
        return fact;

    }
}
