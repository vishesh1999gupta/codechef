package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class chefanddynamo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in) ;

        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            long a=scn.nextLong();
            long s=2*(long)Math.pow(10,n)+a+2;
            System.out.print(s);
            System.out.flush();
            s=s-a;
            long b=scn.nextLong();
            s=s-b;
            long c=s-(long)Math.pow(10,n)-1;
            System.out.print(c);
            System.out.flush();
            s=s-c;
            long d=scn.nextLong();
            s=s-d;
            long e=s;
            System.out.print(e);
            System.out.flush();
            int ans=scn.nextInt();
            if(ans==-1)
                break;
        }
    }
}
