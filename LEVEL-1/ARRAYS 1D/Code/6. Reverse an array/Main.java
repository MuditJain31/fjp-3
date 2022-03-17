import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        reverse(arr);
        display(arr);
    }
}
