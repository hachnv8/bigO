import java.util.Scanner;

/**
 * Created by HachNV on 09/05/2023
 */
public class L01P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String password = sc.next();

        int[] res = findTime(arr, k, password);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int[] findTime(String[] arr, int k, String password) {
        int count = 0;
        int eq = 0;
        int min, max;
        for (String s : arr) {
            if (s.length() < password.length()) count++;
            if (s.length() == password.length()) eq++;
        }
        int extraTime;
        if((count+eq) % k == 0) extraTime = ((count + eq) / k - 1)*5;
        else extraTime = (count + eq) / k * 5;
        if((1+count) % k == 0) min = 1 + count + count/k * 5;
        else  min = 1 + count + (1 + count) / k * 5;

        max = count + eq + extraTime;
        return new int[]{min, max};
    }
}
