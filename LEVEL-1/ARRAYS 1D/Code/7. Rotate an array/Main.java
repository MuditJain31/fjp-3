import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        k = k < 0 ? k + n : k;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void input1D(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        int k = scn.nextInt();

        rotate(arr, k);
        display(arr);
    }

}
