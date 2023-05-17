import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        boolean res = isRespectable(lines);
        if(res) {
            System.out.println("respectable");
        } else {
            System.out.println("ugly");
        }
    }

    public static boolean isRespectable(int[][] lines) {
        List<Integer> xCoordinates = new ArrayList<>();
        List<Integer> yCoordinates = new ArrayList<>();

        for (int[] line : lines) {
            xCoordinates.add(line[0]);
            yCoordinates.add(line[1]);
        }

        Collections.sort(xCoordinates);
        Collections.sort(yCoordinates);
        if(xCoordinates.get(5).equals(xCoordinates.get(4))) return false;

        for (int i = 0; i < xCoordinates.size(); i++) {
            if(!xCoordinates.get(i).equals(yCoordinates.get(i))) return false;
        }

        return true;
    }

}
