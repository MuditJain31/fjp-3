import java.util.*;

public class Main {

    public static boolean isPalindrome(String str) {
        int low = 0, high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void subStr1(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = "";
                for (int k = i; k <= j; k++) {
                    s = s + str.charAt(k);
                }
                if (isPalindrome(s)) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void subStr2(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                if (isPalindrome(s)) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        // method-1
        // subStr1(str);

        // method-2
        subStr2(str);
    }
}