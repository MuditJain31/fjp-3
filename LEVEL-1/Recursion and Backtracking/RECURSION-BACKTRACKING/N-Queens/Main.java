import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int [n][n];
        printNQueens(chess,"",0);
    }
    public static void printNQueens(int [][] chess, String asf , int row){
        if(row == chess.length){
            System.out.println(asf +".");
            return;
        }

        for(int col = 0; col<chess.length; col++){
            if(isSafe(chess,row,col)){
                chess[row][col] = 1;
                printNQueens(chess,asf + row + "-" + col + ", ",row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int [][] chess , int row, int col){
        int tempRow = row;
        int tempCol = col;
       
        //top
        while(tempRow>=0){
            if(chess[tempRow][tempCol]==1){
                return false;
            }
            tempRow--;
        }
        tempRow=row;

        //diagnol-left
        while(tempCol>=0 && tempRow>=0){
            if(chess[tempRow][tempCol]==1){
                return false;
            }
            tempCol--;
            tempRow--;
        }
        tempRow=row;
        tempCol=col;

        //diagnol-right
        while(tempRow>=0 && tempCol<chess.length){
            if(chess[tempRow][tempCol]==1){
                return false;
            }
            tempRow--;
            tempCol++;
        }

        return true;
    }
}