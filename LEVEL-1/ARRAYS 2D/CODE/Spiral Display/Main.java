import java.util.*;

public class Main {
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

        // spiral display

        int minr = 0, minc = 0;
        int maxr = arr.length - 1, maxc = arr[0].length - 1;

        int total = n * m;
        int count = 0;

        while (count < total) {
            // left
            for (int i = minr; i <= maxr; i++) {
                count++;
                if (count > total) {
                    return;
                }
                System.out.println(arr[i][minc]);
            }

            minc++;

            // bottom
            for (int i = minc; i <= maxc; i++) {
                count++;
                if (count > total) {
                    return;
                }
                System.out.println(arr[maxr][i]);
            }
            maxr--;

            // right
            for (int i = maxr; i >= minr; i--) {
                count++;
                if (count > total) {
                    return;
                }
                System.out.println(arr[i][maxc]);
            }
            maxc--;

            // top
            for (int i = maxc; i >= minc; i--) {
                count++;
                if (count > total) {
                    return;
                }
                System.out.println(arr[minr][i]);
            }
            minr++;
        }
    }
}
