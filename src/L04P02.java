import java.util.Scanner;
import java.util.Stack;

public class L04P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] order = new int[1001];
        Stack<Integer> stack = new Stack<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                order[i] = sc.nextInt();
            }

            boolean check = true;
            int start = 1;

            for (int i = 0; i < n; i++) {
                if (!stack.empty() && stack.peek() == start) {
                    stack.pop();
                    start++;
                } else if (order[i] == start) {
                    start++;
                } else {
                    stack.push(order[i]);
                }
            }

            while (!stack.empty() && stack.peek() == start) {
                stack.pop();
                start++;
            }

            if (stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");

            stack.clear();
        }
    }
}
