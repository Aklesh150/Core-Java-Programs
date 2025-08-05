import java.util.*;

public class ArmstrongFunction {
    public static int printArmstrong(int num){
        int rem = 0;
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            sum = sum + (int) Math.pow(rem, 3);
        }
        return sum;
    }

    
    public static void main(String[] args) {
        System.out.println("Enter the Armstrong number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = printArmstrong(num);
        if (num == c) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not a Armstrong");
        }
    }
}
