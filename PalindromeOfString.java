import java.sql.SQLOutput;
import java.util.*;

public class PalindromeOfString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int d = str.length();
        String rev = "";
        for(int i = d-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.print("The string is a Pallindrome");
        }
        else{
            System.out.print("The number is not a Pallindrome");
        }
    }
}

