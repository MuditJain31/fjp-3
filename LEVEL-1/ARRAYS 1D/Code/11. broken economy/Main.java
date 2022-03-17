import java.util.Scanner;

public class Main {

    public static void brokenEconomy(int[] arr, int d) {
        int floor = 0, ceil = 0;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == d) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } else if (d > arr[mid]) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        brokenEconomy(arr, d);
    }
}
