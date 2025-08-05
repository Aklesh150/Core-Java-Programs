import java.util.*;

public class TwoNumOfSumThroughFunction {
    public static int calculateSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a , b);
        System.out.println(sum);
    }
}
