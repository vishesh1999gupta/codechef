package codechef;

import java.util.Scanner;

public class weaponvalue {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String[] ar=new String[n];
            for(int i=0;i<n;i++){
                ar[i]=scn.next();
            }
            String ans=ar[0];
            for(int i=1;i<n;i++){
                ans=(Integer.parseInt(ans,2)^Integer.parseInt(ar[i],2))+"";
                ans=Integer.toBinaryString(Integer.parseInt(ans));
            }
            System.out.println(Integer.bitCount(Integer.parseInt(ans,2)));
        }
    }
}
