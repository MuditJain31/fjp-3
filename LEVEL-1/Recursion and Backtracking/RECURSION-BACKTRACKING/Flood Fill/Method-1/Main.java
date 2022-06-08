
//Method - 1 BY USING EXTRA SPACE
import java.util.Scanner;

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

        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);

    }

    public static void floodfill(int[][] arr, int sr, int sc, String asf, boolean[][] visited) {
        if (sr > arr.length - 1 || sc > arr[0].length - 1 || sr < 0 || sc < 0 || arr[sr][sc] == 1
                || visited[sr][sc] == true) {
            return;
        }
        if (sr == arr.length - 1 && sc == arr[0].length - 1) {
            System.out.println(asf);
            return;
        }

        visited[sr][sc] = true;
        floodfill(arr, sr - 1, sc, asf + "t", visited);
        floodfill(arr, sr, sc - 1, asf + "l", visited);
        floodfill(arr, sr + 1, sc, asf + "d", visited);
        floodfill(arr, sr, sc + 1, asf + "r", visited);
        visited[sr][sc] = false;

    }
}