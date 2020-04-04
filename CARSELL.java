package codechef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CARSELL {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            Integer arr[]=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int profit=0;
            Arrays.sort(arr, Collections.reverseOrder());
            int count=0;
            while(count<n){
                if(arr[count]-count>0)
                profit=(profit+arr[count]-count)%1000000007;
                count++;
            }
            System.out.println(profit);
        }

    }
}
