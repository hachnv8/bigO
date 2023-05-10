import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by HachNV on 09/05/2023
 */
public class L01P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        int num1, num2;
        for (int i = 0; i < n; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            list.add(new int[]{num1, num2});
        }

        int res = findIndex(list);
        System.out.println(res);
    }
    public static int findIndex(List<int[]> list) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] ints : list) {
            if (ints[0] < min) min = ints[0];
            if (ints[1] > max) max = ints[1];
        }
        int[] target = new int[]{min, max};
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (Arrays.equals(list.get(i), target)) {
                index = i+1;
                break;
            }
        }
        return index;
    }
}
