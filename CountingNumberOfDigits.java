import java.util.Scanner;

public class CountingNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        int num = sc.nextInt();
        int count = 0;
        if (num == 0)
            System.out.println("Number of digit is 1");
        if (num < 0) {
            num = -num;
        }
        while(num>0){
            num= num/10;
            count++;
        }
        System.out.println("Number of digits is:" +count);

    }
}
