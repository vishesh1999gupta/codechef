package codechef;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CHPINTU {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int[] ar1=new int[n];
            int[] ar2=new int[n];
            for(int i=0;i<n;i++){
                ar1[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++){
                ar2[i]=scn.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(ar1[i])){
                    map.put(ar1[i],map.get(ar1[i])+ar2[i]);
                }
                else map.put(ar1[i],ar2[i]);
            }
            int ans= Collections.min(map.values());
            System.out.println(ans);
        }
    }
}
