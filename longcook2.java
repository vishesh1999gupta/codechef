package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class longcook2 {
    public static void main(String[] args) {
//        int val = 6;
//        int[] arr = new int[401];
//        for (int i = 1; i <= 400; i++) {
//            int friday = 8 - val % 7;
//            if(val==0){
//                friday-=7;
//            }
//            int end = friday + 10;
//            int l = friday + 2;
//            int day = 0;
//            if (i % 4 != 0) {
//                day = 28;
//                val=(val+1)%7;
//            } else if (i % 4 == 0) {
//                if (i % 100 == 0 && i % 400 != 0) {
//                    day = 28;
//                    val=(val+1)%7;
//                } else {
//                    day = 29;
//                    val=(val+2)%7;
//                }
//            }
//
//            while (l <= day) {
//                l = l + 7;
//            }
//            int lunch = l - 14;
//
//            if (lunch < end){
//                arr[i]=1;
//            }
//        }
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                count++;
//            }
//        }
//        System.out.println(count);

     int[] arr={0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0};
     Scanner scn=new Scanner(System.in);
     int t=scn.nextInt();
     while(t-->0){
         int count1=0;
         int count2=0;
         int m1=scn.nextInt();
         int y1=scn.nextInt();
         int m2=scn.nextInt();
         int y2=scn.nextInt();
         int x1=0;
         if(m1>2){
             x1=y1;
         }
         else x1=(y1-1);
         count1+=(x1/400)*101;
         x1=x1%400;
         for(int i=1;i<=x1;i++){
             count1+=arr[i];
         }
         if(m2>=2){
             x1=y2;
         }
         else x1=y2-1;
         count2+=(x1/400)*101;
         x1=x1%400;
         for(int i=1;i<=x1;i++){
             count2+=arr[i];
         }
         System.out.println(count2-count1);
     }
    }
}

