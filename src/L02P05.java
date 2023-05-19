import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = findScore(arr);
        System.out.println(res[0] + " " + res[1]);
    }

    public  static int[] findScore(int[] arr) {
        int p1 = 0;
        int p2 = arr.length-1;
        int score1 = 0;
        int score2 = 0;
        int i = 0, j = 0;
        while (p1 <= p2) {
            if(arr[p1] < arr[p2]) {
                if(i >= j) {
                    score1 += arr[p2];
                    j++;
                }
                else {
                    score2 += arr[p2];
                    i++;
                }
                p2--;
            } else {
                if(i < j) {
                    score2 += arr[p1];
                    i++;
                }
                else {
                    score1 += arr[p1];
                    j++;
                }
                p1++;
            }
        }
        return new int[] {score1, score2};
    }
}
