import java.util.*;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int rev = 0;
        while(temp !=0) {
            rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        if(num == rev) {
            System.out.print("The number is pallindrome");
        }
            else{
                System.out.println("The number is not pallindrome");
            }


    }
}

