import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = findMaxBooks(a, t);
        System.out.println(res);
    }

    public static int findMaxBooks(int[] a, int t) {
        int max = 0;
        int p1 = 0;
        int p2 = 0;
        int time = 0;
        while (p2 < a.length) {
            if (time + a[p2] <= t) {
                time += a[p2];
                p2++;
                max = Math.max(max, p2 - p1);
            }
            else {
                time -= a[p1];
                p1++;
            }
        }
        return max;

    }
}
