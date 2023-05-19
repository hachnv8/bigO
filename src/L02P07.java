import java.util.Scanner;

/**
 * Created by HachNV on 15/05/2023
 */
public class L02P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = findAlive(arr);
        System.out.println(res);
    }

    public static int findAlive(int[] arr) {
        int count = 0;
        boolean[] dead = new boolean[arr.length];
        int i = arr.length-1;
        int j = i-1;
        while(i >= 0) {
            if(arr[i] - (i-j) >= 0) {
                dead[j] = true;
                j--;
            } else {
                i--;
                j = i -1;
            }
            if(j < 0 || i < 0) break;
        }
        for (boolean b: dead) {
            if(!b) count++;
        }
        return count;
    }
}
