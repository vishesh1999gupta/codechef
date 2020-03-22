package codechef;

import java.util.*;

public class ENGLISH {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            HashSet<String> map = new HashSet<>();
            long sum=0l;
            for(int i=0;i<n;i++) {
                String s = scn.next();

                if (map.contains(s)) {
                    sum+=s.length()*s.length();
                    map.remove(s.length());
                }
                else map.add(s);
            }

        }

    }

    private static long calc(String s, String s1) {

        long i=0l;
        while(i<s.length()&& i<s1.length() && s.charAt((int)i)==s1.charAt((int)i)){
            i++;
        }

        return i*i;
    }
}
