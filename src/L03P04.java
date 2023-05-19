import java.util.Scanner;

/**
 * Created by HachNV on May 15, 2023
 */
public class L03P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] res = findRank(a);
        for (int i = 0; i < res.length-1; i++) {
            System.out.print(res[i]  + " ");
        }
        System.out.println(res[n-1]);
    }

    public static int[] findRank(int[] a) {
        int[] ranks = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int rank = 1;
            for (int j : a) {
                if (j > a[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }
}
