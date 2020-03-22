package codechef;

import java.util.Scanner;

public class CASH {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            long ans=0l;
            for(int i=0;i<n;i++){
                ans+=arr[i];
            }
            ans=ans%k;
            System.out.println(ans);
        }
    }
}
