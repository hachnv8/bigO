import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] res = findMinimum(array, k);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] findMinimum(int[] arr, int k) {
        int[] minimum = new int[2];
        int[] count = new int[100100];
        int j = 0, p1 = 0, p2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 0) j++;
            if(j==k && p2 == -1) {
                p2 = i;
                count[arr[i]]++;
            } else if(p2 == -1) {
                count[arr[i]]++;
            }
        }

        if(j < k) {
            minimum[0] = -1;
            minimum[1] = -1;
        } else {
            while (count[arr[p1]] > 1) {
                count[arr[p1]]--;
                p1++;
            }
            minimum[0] = p1+1;
            minimum[1] = p2+1;
        }
        return minimum;
    }
}
