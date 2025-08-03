import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num = sc.nextInt();
        int sum = 0;
        int Rem ;
        if(num==0){
            System.out.println("Sum of digit is 0");
        }
        if(num<0){
            num = -num;
        }
        while(num>0){
           Rem = num%10;
           sum = Rem+sum;
           num = num/10;
        }
        System.out.println("Sum of the digit is:" +sum);
    }
}
