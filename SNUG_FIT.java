package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SNUG_FIT {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[] ar1=new int[n];
            int[] ar2=new int[n];
            for(int i=0;i<n;i++){
                ar1[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++){
                ar2[i]=scn.nextInt();
            }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            long ans=0l;
            for(int i=0;i<n;i++){
                ans+=Math.min(ar1[i],ar2[i]);
            }
            System.out.println(ans);
        }
    }

}
