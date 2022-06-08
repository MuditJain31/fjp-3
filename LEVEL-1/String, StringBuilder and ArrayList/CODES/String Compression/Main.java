import java.util.*;

public class Main {

    public static void compression1(String str) {
        String ans = "";
        ans = ans + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void compression2(String str) {
        String ans = "";

        ans += str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (count > 1)
                    ans = ans + count;
                ans = ans + str.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1)
            ans = ans + count;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        compression1(str);
        compression2(str);
    }
}
