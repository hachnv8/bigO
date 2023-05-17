import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int res = findRes(a, b);
        System.out.println(n-res);
    }

    public static int findRes(int[] a, int[] b) {
        int p1 = 0, p2 = 0, count = 0;
        while(p1 < a.length && p2 < b.length) {
            if (a[p1] <= b[p2]) {
                count++;
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return count;
    }
}
