import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String rev = "";
        int d = str.length();
        for (int i = d - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}
