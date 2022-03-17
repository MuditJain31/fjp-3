import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int index=binarySearch(arr, k);
        
        System.out.println(index);
    }
}
