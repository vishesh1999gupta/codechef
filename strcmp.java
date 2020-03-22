package codechef;

import java.util.Scanner;

public class strcmp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s = scn.next();
            int count = 1;
            int x = 0;
            StringBuilder ans = new StringBuilder();
            ans.append(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1))
                    count++;
                else {
                    ans.append(count);
                    ans.append(s.charAt(i));
                    count = 1;
                }

            }
                ans.append(count);


            if (ans.length() < s.length()) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
