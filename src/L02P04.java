import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        List<int[]> res = findAll(a, b, x, y);
        System.out.println(res.size());
        for (int[] ele: res) {
            System.out.println(ele[0] + " " + ele[1]);
        }
    }

    public static List<int[]> findAll(int[] a, int[] b, int x, int y) {
        List<int[]> all = new ArrayList<>();
        boolean[] usedA = new boolean[a.length];
        boolean[] usedB = new boolean[b.length];
        int p1 = 0, p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] - x <= b[p2] && a[p1] + y >= b[p2] && !usedA[p1] && !usedB[p2]) {
                all.add(new int[]{p1+1, p2+1});
                usedA[p1] = true;
                usedB[p2] = true;
                p1++;
                p2++;
            } else if (a[p1] - x > b[p2]) {
                p2++;
            } else if (a[p1] + y < b[p2]) {
                p1++;
            } else {
                if (usedA[p1]) {
                    p1++;
                } else {
                    p2++;
                }
            }
        }
        return all;
    }

}
