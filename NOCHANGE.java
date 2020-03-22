package codechef;

import java.util.Scanner;

public class NOCHANGE {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int p=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int flag=0;
            int i=0;
            while(i<n){
                if(arr[i]>p || p%arr[i]!=0){
                    flag=1;
                    break;
                }
                i++;
            }
            int k=0;
            if(flag!=1) {
                while (k < n - 1) {
                    if (arr[k + 1] % arr[k] != 0) {
                        flag = 2;
                        break;
                    }
                    k++;
                }
            }
            if(flag==0){
                System.out.println("NO");
            }
            else if(flag==1){
                int[] ans=new int[n];
                ans[i]=(p/arr[i])+1;
                System.out.print("YES ");
                for(int j=0;j<n-1;j++){
                    System.out.print(ans[j]+" ");
                }
                System.out.println(ans[n-1]);
            }
            else{
                int[] ans=new int[n];
                ans[k]=arr[k+1]/arr[k]+1;
                ans[k+1]=p/arr[k+1] -1;
                System.out.print("YES ");
                for(int j=0;j<n-1;j++){
                    System.out.print(ans[j]+" ");
                }
                System.out.println(ans[n-1]);
            }


        }
    }
}
