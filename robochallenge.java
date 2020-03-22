package codechef;

import java.util.Scanner;

public class robochallenge {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t>0){
            String str=scn.next();
            int count=100;
            int i=0;
            for(;i<str.length();i++){
                char ch=str.charAt(i);
              if(ch!='.'){
                  int p=ch-48;
                  if(count-p<0){
                      System.out.println("unsafe");
                      break;
                  }
                  else count=-p;
              }
              else{
                  count++;
              }
            }
            if(i==str.length())
            System.out.println("safe");
            t--;
        }
    }
}
