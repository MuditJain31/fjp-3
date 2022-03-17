import java.util.*;

public class Main {
    public static void diffOfArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] ans = new int[n2];

        int borrow = 0;

        int k = ans.length - 1, i = n1 - 1;

        while (k >= 0) {
            int sub = borrow + arr2[k];

            if (i >= 0) {
                sub -= arr1[i];
            }

            if (sub < 0) {
                sub += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = sub;
            k--;
            i--;
        }

        int firstNonZero = -1;

        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != 0) {
                firstNonZero = j;
                break;
            }
        }

        for (int j = firstNonZero; j < ans.length; j++) {
            System.out.println(ans[j]);
        }

    }

    public static void input1D(int[] arr) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int[] arr1 = new int[n1];
        input1D(arr1);

        int n2 = scn.nextInt();

        int[] arr2 = new int[n2];
        input1D(arr2);

        diffOfArrays(arr1, arr2);
    }
}