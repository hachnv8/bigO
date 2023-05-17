import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = findCount(arr);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] findCount(int[] arr) {
        int[] count = new int[2];
        int p1 = 0;
        int p2 = arr.length-1;
        int time1 = 0;
        int time2 = 0;
        while(p1 <= p2) {
            if(time1 <= time2) {
                time1 += arr[p1];
                p1++;
                count[0]++;
            } else {
                time2 += arr[p2];
                p2--;
                count[1]++;
            }
        }
        return count;
    }
}
