import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HachNV on May 15, 2023
 */
public class L03P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] complexities = new int[n];
        for (int i = 0; i < n; i++) {
            complexities[i] = sc.nextInt();
        }

        int res = findWays(complexities, a, b);
        System.out.println(res);
    }

    public static int findWays(int[] complexities, int a, int b) {
        int ways = 0;
        Arrays.sort(complexities);
        int countB = 0;
        for (int i = 0; i < complexities.length; i++) {
            countB++;
            if(countB == b) {
                ways = complexities[i+1] - complexities[i];
                return ways;
            }
        }
        return ways;
    }
}
