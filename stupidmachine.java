package codechef;

import java.util.Scanner;

public class stupidmachine {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        while(t-->0){
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int min=arr[0];
            long ans=0l;
           for(int i=0;i<n;i++){
               if(min<=arr[i]){
                   ans+=min;
               }
               else{
                   ans+=arr[i];
                   min=arr[i];
               }
           }
            System.out.println(ans);

        }
    }
}
