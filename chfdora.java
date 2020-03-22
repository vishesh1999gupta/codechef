package codechef;

import java.util.Scanner;

public class chfdora {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=scn.nextInt();
                }
            }
            int ans=0;
           for(int i=0;i<(Math.min(n,m)+1);i++){
               ans+=pattern(arr,i,i,i);
           }
            System.out.println(ans);
        }
    }
    public static int pattern(int[][] arr,int i,int cr,int cc){
        int count=0;
        for(int x=cr;x<arr.length-i;x++){
            for(int y=cc;y<arr[0].length-i;y++){
                if(checkpal(x,y,i,arr)){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean checkpal(int x, int y, int i, int[][] arr) {
        //vertical
        for(int j=1;j<=i;j++){
            if(arr[x-j][y]!=arr[x+j][y] || arr[x][y-j]!=arr[x][y+j]){
                return false;
            }
        }
        return true;
    }
}
