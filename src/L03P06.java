import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HachNV on 17/05/2023
 */
public class L03P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }

        int[] res = findTowers(lengths);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] findTowers(int[] lengths) {
        int minimal = 0;
        int max = 0;
        int height = 0;
        Arrays.sort(lengths);
        for (int i = 0; i < lengths.length-1; i++) {
            if(lengths[i] == lengths[i+1]) {
                height++;
                if(i == lengths.length-2) max = Math.max(max, height);
            }
            else {
                max = Math.max(max, height);
                height = 0;
                minimal++;
            }
        }
        return new int[]{max+1, minimal+1};
    }
}
