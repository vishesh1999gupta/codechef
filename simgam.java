package codechef;

import java.util.Scanner;

public class simgam {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[][] arr=new int[n][];
            for(int i=0;i<n;i++){
                int r=scn.nextInt();
                arr[i]=new int[r];
                for(int j=0;j<r;j++)
                    arr[i][j]=scn.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<arr[i].length/2;j++){
                    sum+=arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
