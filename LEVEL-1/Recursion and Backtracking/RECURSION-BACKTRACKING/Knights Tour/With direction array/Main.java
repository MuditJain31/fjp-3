import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int [n][n];

        int row = scn.nextInt();
        int col = scn.nextInt();

        printKnightsTour(chess,row,col,1);
    }
    static int [][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    public static void printKnightsTour(int [][] chess , int row, int col, int upcomingMove){
        if(row>=chess.length || col>=chess.length || row<0 || col<0 || chess[row][col]!=0){
            return;
        }

        chess[row][col] = upcomingMove;

        if(upcomingMove==chess.length*chess.length){
            displayBoard(chess);
            chess[row][col] = 0;
            return;

        }

        for(int i=0; i<dir.length; i++){
            int r = row + dir[i][0];
            int c = col + dir[i][1]; 
            printKnightsTour(chess,r,c,upcomingMove+1);
        }
        chess[row][col] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}