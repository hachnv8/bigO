import java.util.Scanner;

/**
 * Created by HachNV on 10/05/2023
 */
public class L01P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String res = findStructure(s, t);
        System.out.println(res);
    }

    public static String findStructure(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        if(s.length() == t.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if(sb1.indexOf(String.valueOf(sb2.charAt(i))) == -1)
                    return "need tree";
            }
            return "array";
        } else {
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr1[s.charAt(i) - 'a']++;
                if(i < t.length()) {
                    arr2[t.charAt(i) - 'a']++;
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] < arr2[i]) return "need tree";
            }
            int j = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==t.charAt(j)) {
                    j++;
                    if(j == t.length()) return "automaton";
                }
            }
            return "both";


        }
    }
}
