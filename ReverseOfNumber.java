import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0)
        {
            int d = num%10;
            rev = rev*10+ d;
            num = num/10;
        }
        System.out.print(rev);
    }
}
