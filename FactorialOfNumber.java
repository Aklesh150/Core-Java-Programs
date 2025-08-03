import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int Fact = 1;
        for(int i = num; i>=1; i--)
        {
            Fact = Fact*i;
        }
        System.out.print(Fact);

    }
}
