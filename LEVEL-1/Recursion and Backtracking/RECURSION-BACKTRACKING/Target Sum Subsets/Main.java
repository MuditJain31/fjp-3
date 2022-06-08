import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int [n];

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        printTargetSumSubsets(arr,0,"",0,target);

    }
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int ssf, int target) {
        if(idx==arr.length){
            if(ssf==target){
                System.out.println(set+".");
            }
            return;
        }

        printTargetSumSubsets(arr,idx+1,set + arr[idx] + ", ",ssf+arr[idx],target);
        printTargetSumSubsets(arr,idx+1,set,ssf,target);
    }
    
}