import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [][] arr = new int[n][n];

        for(int i  =0 ; i<arr.length;i++){
            for(int j = 0 ; j<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //lower triangle

        for(int gap = arr.length-1; gap>=0; gap--){
            for(int i=gap,j=0; i<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }

        //upper trianlge
        for(int gap = 1;gap<arr.length;gap++){
            for(int i=0 , j = gap; j<arr.length;j++,i++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
