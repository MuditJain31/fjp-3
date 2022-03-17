import java.util.Scanner;

public class Main {

    public static void sumOfArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] ans = new int[n1 > n2 ? n1 : n2];

        int carry = 0;
        int k = ans.length - 1, j = n2 - 1, i = n1 - 1;

        while (k >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }

            carry = sum / 10;
            sum = sum % 10;
            ans[k] = sum;
            k--;
            j--;
            i--;
        }

        if (carry > 0) {
            System.out.println(carry);
        }

        for (int val : ans) {
            System.out.println(val);
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

        sumOfArrays(arr1, arr2);
    }
}
