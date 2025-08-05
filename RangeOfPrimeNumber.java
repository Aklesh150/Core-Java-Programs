import java.util.*;

public class RangeOfPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Range");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for(int n = start; n <= end; n++) {
            int innerCount = 0;
            for(int i = 1; i <= n; i++) {
                if(n%i == 0) {
                    innerCount++;
                }
            }
            if(innerCount == 2) {
                count++;
            }
        }
        System.out.print(count + " ");
    }
}
