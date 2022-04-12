import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {

        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        input(arr1);

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = new int[n2][m2];
        input(arr2);

        if (m1 == n2) {
            int[][] ans = new int[n1][m2];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    for (int k = 0; k < n2; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }

                }
            }
            display(ans);
        } else {
            System.out.println("Invalid input");
        }
    }
}