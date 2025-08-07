import java.util.*;

public class SimpleCalculator {
        public static void main(String[] args) {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            char result = sc.next().charAt(0);
            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            int mod = a % b;
            switch(result){
                case '+' : System.out.println(sum);
                    break;
                case '-' : System.out.println(sub);
                    break;
                case '*' : System.out.println(mul);
                    break;
                case '/' : System.out.println(div);
                    break;
                case '%' : System.out.println(mod);
                    break;
                default : System.out.println("Invalid");
            }
        }
}


