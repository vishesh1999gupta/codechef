package codechef;

import java.util.Scanner;

public class COVIDLQ {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int key=0;
            int flag=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(flag==0 && arr[i]==1){
                    flag=1;
                }
                else if(flag==1 && arr[i]==1 && count<5) {
                    System.out.println("NO");
                    key=1;
                    break;
                }
                else if(flag==1 && arr[i]==1 && count>=5){
                    count=0;
                }
                if(flag==1 && arr[i]==0){
                    count++;
                }
            }
            if(key==0){
                System.out.println("YES");
            }
        }
    }
}
