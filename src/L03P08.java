import java.util.*;

/**
 * Created by HachNV on 17/05/2023
 */
public class L03P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] lines = new int[8][2];
        for (int i = 0; i < lines.length; i++) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        isRespectable(lines);
    }

    public static void isRespectable(int[][] lines) {
        Arrays.sort(lines, (int[] a, int[] b) -> {
            int compareResult = Integer.compare(a[0], b[0]);
            if (compareResult == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return compareResult;
        });
        if (lines[0][0] == lines[1][0] && lines[1][0] == lines[2][0]
                && lines[2][0] != lines[3][0] && lines[3][0] == lines[4][0]
                && lines[4][0] != lines[5][0] && lines[5][0] == lines[6][0]
                && lines[6][0] == lines[7][0] && lines[0][1] == lines[3][1]
                && lines[3][1] == lines[5][1] && lines[1][1] != lines[4][1]
                && lines[1][1] == lines[6][1] && lines[2][1] == lines[4][1]
                && lines[4][1] == lines[7][1])
        {
            System.out.println("respectable");
        } else {
            System.out.println("ugly");
        }
    }

}
