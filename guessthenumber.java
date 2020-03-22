package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            ArrayList<Integer> arr=new ArrayList<>();
            double a=scn.nextDouble();
            double m=scn.nextDouble();
            for(int i=1;i<m;i++){
               double ans=(double)(m*i)/(double)(a*i+1);
               if(ans-(int)ans==0){
                   arr.add((int)ans);
               }
            }
            if(((double)(m-1)/a)-(int)((m-1)/a)==0){
                arr.add((int)((m-1)/a));
            }
            System.out.println(arr.size());
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
