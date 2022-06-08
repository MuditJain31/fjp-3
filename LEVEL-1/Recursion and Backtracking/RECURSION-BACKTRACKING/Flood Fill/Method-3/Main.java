//Method 3 USING DIRECTION ARRAY
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

    static int [][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static String [] dirName = {"t","l","d","r"};
    public static void floodfill(int[][] arr , int sr , int sc , String asf){
        if(sr>arr.length-1 || sc>arr[0].length-1 || sr<0 || sc<0 || arr[sr][sc] == 1){
            return;
        }
        if(sr==arr.length-1 && sc==arr[0].length-1){
            System.out.println(asf);
            return;
        }

        arr[sr][sc]=1;
        for(int i = 0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            floodfill(arr,r,c,asf + dirName[i]);    
        }
        arr[sr][sc]=0;

    }
}