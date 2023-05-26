import java.util.Scanner;
import java.util.Stack;

/**
 * Created by HachNV on May 19, 2023
 */
public class L04P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String expression = sc.next();
            transform(expression);
        }
    }

    public static void transform(String expression) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(Character.isLetter(symbol)) {
                System.out.print(symbol);
            }
            else if(symbol == ')') {
                System.out.print(s.pop());
            } else if(symbol != '(') {
                s.push(symbol);
            }
        }
        System.out.println();
    }
}
