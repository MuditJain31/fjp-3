import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}