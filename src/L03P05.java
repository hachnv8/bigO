import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HachNV on 17/05/2023
 */
public class L03P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] capacities = new int[n*2];
        for (int i = 0; i < capacities.length; i++) {
            capacities[i] = sc.nextInt();
        }

        double res = findMax(capacities, w);
        System.out.println(res);
    }

    public static double findMax(int[] capacities, int w) {
        double max;
        double p;
        Arrays.sort(capacities);
        int middle = capacities.length/2;
        int start = 0;
        if(capacities[middle]/capacities[start] >= 2) {
            p = capacities[start];
        } else {
            p = ((double) capacities[middle])/2;
        }
        max = 3*p*(capacities.length/2);
        if(max > w) return w;
        return max;
    }
}
