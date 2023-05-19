import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HachNV on May 15, 2023
 */
public class L03P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Integer[] subjects = new Integer[n];
        for (int i = 0; i < n; i++) {
            subjects[i] = sc.nextInt();
        }

        long result = selfLearning(subjects, x);
        System.out.println(result);
    }

    public static long selfLearning(Integer[] subjects, int x) {
        Arrays.sort(subjects);
        long min_time = 0;
        for (int subject : subjects) {
            min_time += (long) subject * x;
            if (x > 1) x--;
        }
        return min_time;
    }
}
