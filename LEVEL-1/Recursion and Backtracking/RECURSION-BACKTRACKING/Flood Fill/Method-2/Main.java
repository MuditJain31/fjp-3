// METHOD-2 WITHOUT TAKING EXTRA SPACE
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        floodfill(arr,0,0,"");
        
    }

    public static void floodfill(int[][] arr , int sr , int sc , String asf){
        if(sr>arr.length-1 || sc>arr[0].length-1 || sr<0 || sc<0 || arr[sr][sc] == 1){
            return;
        }
        if(sr==arr.length-1 && sc==arr[0].length-1){
            System.out.println(asf);
            return;
        }

        arr[sr][sc]=1;
        floodfill(arr,sr-1,sc,asf+"t");
        floodfill(arr,sr,sc-1,asf+ "l");
        floodfill(arr,sr+1,sc,asf+"d");
        floodfill(arr,sr,sc+1,asf+"r");
        arr[sr][sc]=0;

    }
}