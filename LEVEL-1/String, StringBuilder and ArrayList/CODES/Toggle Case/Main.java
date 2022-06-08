import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 97) {
                ans = ans + (char) (str.charAt(i) - 'a' + 'A');
            } else {
                ans = ans + (char) (str.charAt(i) - 'A' + 'a');
            }

        }

        System.out.println(ans);
    }
}
