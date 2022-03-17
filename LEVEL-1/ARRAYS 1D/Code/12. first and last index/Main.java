import java.util.Scanner;

public class Main {

    public static void firstIndex(int[] arr, int d) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == d) {

                index = mid;
                right = mid - 1;

            } else if (d > arr[mid]) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }
        }
        System.out.println(index);
    }

    public static void lastIndex(int[] arr, int d) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == d) {

                index = mid;
                left = mid + 1;

            } else if (d > arr[mid]) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        firstIndex(arr, d);
        lastIndex(arr, d);
    }
}
