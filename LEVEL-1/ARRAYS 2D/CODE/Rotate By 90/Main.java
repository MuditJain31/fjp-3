import java.util.Scanner;

public class Main {

    public static void transpose(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseRow(int [][] arr){
        int low = 0,high = arr.length-1;

        while(low<high){
            for(int  i=0;i<arr.length;i++){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
            }
            low++;
            high--;
        }
    }


    public static void display(int[][] arr){
        for(int i  = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();
        int [][] arr = new int [n][n];

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

       transpose(arr);
       reverseRow(arr);
       display(arr); 

    }
}
