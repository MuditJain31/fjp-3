import java.util.*;

public class Main {

    public static void search2D(int [][] arr,int x){
        int i = 0;
        int j = arr.length-1;

        while(i>=0 && j>=0 && j<arr.length && i<arr.length){
            if(arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(x>arr[i][j]){
                i++;
            }else{
                j--;
            }
        }

        System.out.println("Not Found");

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();
        int [][] arr = new int [n][n];

        for(int  i =0  ; i<arr.length;i++){
            for(int j = 0 ; j<arr.length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int x = scn.nextInt();
        search2D(arr,x);
    }
}
