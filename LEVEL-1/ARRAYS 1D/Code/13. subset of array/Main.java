import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0 ; i<(int)Math.pow(2,n);i++){
            int temp = i;
            String str="";

            int index=arr.length-1;

            while(index>=0){
                int rem = temp%2;
                temp/=2;
                if(rem==1){
                    str = arr[index]+"\t"+str;
                }else{
                    str = "-\t"+str;
                }
                index--;
            }

            System.out.println(str);

        }

    }
}
