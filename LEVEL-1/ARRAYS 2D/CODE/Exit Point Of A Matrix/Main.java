import java.util.Scanner;

public class Main {

    public static void exitPoint1(int[][] arr) {
        int dir = 0;
        int i = 0, j = 0;
        while (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
            dir += arr[i][j];
            dir %= 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }

        }

        // bahar kaha se nikla
        if (i < 0) {
            i++;
        } else if (j < 0) {
            j++;
        } else if (j == arr[0].length) {
            j--;
        } else {
            i--;
        }

        System.out.println(i);
        System.out.println(j);
    }

    public static void exitPoint2(int[][] arr) {
        int dir = 0;
        int curri = 0, currj = 0;
        int i = 0, j = 0;
        while (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
            dir += arr[i][j];
            dir %= 4;
            curri = i;
            currj = j;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }

        }
        System.out.println(curri);
        System.out.println(currj);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();

            }
        }

        // exit point (Way-1)
        exitPoint1(arr);

        // exit point (way-2)
        exitPoint2(arr);
    }
}
