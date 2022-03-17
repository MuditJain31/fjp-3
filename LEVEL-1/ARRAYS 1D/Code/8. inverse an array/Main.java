import java.util.Scanner;

public class Main {

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static int[] inverse(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            res[temp] = i;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] inverseArr = inverse(arr);
        display(inverseArr);
    }
}
