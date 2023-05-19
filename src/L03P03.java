import java.util.Scanner;

/**
 * Created by HachNV on May 15, 2023
 */
public class L03P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = findChild(arr);
        if (res[0] == -1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
            System.out.println(res[0] + " " + res[1]);
        }
    }

    public static int[] findChild(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            return new int[]{1, 1};
        }

        for (int i = arr.length - 1; i > start; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        reverseArray(arr, start, end);

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return new int[]{start+1, end+1};
        } else {
            return new int[]{-1, -1};
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
