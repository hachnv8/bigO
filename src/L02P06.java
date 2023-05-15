import java.util.Scanner;

/**
 * Created by HachNV on May 15, 2023
 */
public class L02P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = findMax(arr);
        System.out.println(res);
    }

    public static int findMax(int[] arr) {
        int n = arr.length;
        int p1 = 0;
        int p2 = 0;
        int max = 0;
        int minVal = arr[0];
        int maxVal = arr[0];
        while (p1 < n) {
            if (Math.abs(maxVal - minVal) <= 1) {
                max = Math.max(max, p1 - p2 + 1);
                p1++;
                if (p1 < n) {
                    minVal = Math.min(minVal, arr[p1]);
                    maxVal = Math.max(maxVal, arr[p1]);
                }
            } else {
                p2++;
                minVal = arr[p2];
                maxVal = arr[p2];
                for (int i = p2 + 1; i <= p1; i++) {
                    minVal = Math.min(minVal, arr[i]);
                    maxVal = Math.max(maxVal, arr[i]);
                }
            }
        }
        return max;
    }

}
