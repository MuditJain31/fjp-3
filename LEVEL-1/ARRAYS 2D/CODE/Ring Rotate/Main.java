import java.util.*;

public class Main {
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k += arr.length;
        }
        reverse(arr, 0, arr.length - 1 - k);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int spiral = scn.nextInt();
        int k = scn.nextInt();

        int minc = spiral - 1, minr = spiral - 1;
        int maxc = arr[0].length - spiral, maxr = arr.length - spiral;

        int[] temp = new int[2 * (maxc - minc + maxr - minr)];


        /*
            Values jinko rotate karna hai unko extract karenge and temp me store karenge
        */
        int count = 0;

        // left
        for (int i = minr; i <= maxr; i++) {
            temp[count] = arr[i][minc];
            count++;
        }
        minc++;

        // bottom
        for (int i = minc; i <= maxc; i++) {
            temp[count] = arr[maxr][i];
            count++;
        }
        maxr--;

        // right
        for (int i = maxr; i >= minr; i--) {
            temp[count] = arr[i][maxc];
            count++;
        }
        maxc--;

        // top
        for (int i = maxc; i >= minc; i--) {
            temp[count] = arr[minr][i];
            count++;
        }
        minr++;

        rotate(temp, k);



        /*
            put rotated values in 2d array
        */

        minr--;
        minc--;
        maxc++;
        maxr++;

        count = 0;
        // left
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = temp[count];
            count++;
        }
        minc++;

        // bottom
        for (int i = minc; i <= maxc; i++) {
            arr[maxr][i] = temp[count];
            count++;
        }
        maxr--;

        // right
        for (int i = maxr; i >= minr; i--) {
            arr[i][maxc] = temp[count];
            count++;
        }
        maxc--;

        // top
        for (int i = maxc; i >= minc; i--) {
            arr[minr][i] = temp[count];
            count++;
        }
        minr++;

        display(arr);

        scn.close();

    }
}
