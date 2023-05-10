import java.util.Scanner;

/**
 * Created by HachNV on 09/05/2023
 */
public class L01P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[na];
        int[] b = new int[nb];
        for (int i = 0; i < na; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            b[i] = sc.nextInt();
        }
        boolean isExist = checkExist(a, b, k, m);
        if(isExist) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean checkExist(int[] a, int[] b, int k, int m){
        int p1 = 0, p2 = 0;
        while(p1 < a.length && p2 < b.length) {
            if(a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
            if(p1 == k && b.length - p2 >= m) return true;
            else if(p1 == k && b.length - p2 < m) return false;
        }
        return false;
    }
}
