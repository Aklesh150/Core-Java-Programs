import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int A = sc.nextInt();
        System.out.println("Enter the second number");
        int B = sc.nextInt();
        int sum;
        sum = A + B;
        System.out.println(sum);
    }
}
