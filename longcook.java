package codechef;

import java.util.Scanner;

public class longcook {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int[] ar = new int[28];
        ar[3] = 1;
        ar[9] = 1;
        ar[14] = 1;
        ar[15] = 1;
        ar[20] = 1;
        ar[25] = 1;
        ar[26] = 1;
        while (t-- > 0) {
            int m1 = scn.nextInt();
            int y1 = scn.nextInt();
            int m2 = scn.nextInt();
            int y2 = scn.nextInt();
            int q = 0;
            int r1 = 0;
            int t1 = 0;
            int j1 = 0;
            int ans = 0;
            int v1 = 0;
            int r2 = 0;
            if (y1 < 2000) {
                q = 2000 - y1;
                r1 = q % 28;
                j1 = y1 + r1;

            } else {
                q = y1 - 2000;
                r1 = q % 28;
                if (r1 != 0)
                    j1 = y1 + 28 - r1;
                else j1 = y1;
            }
            int j2 = 0;
            int v2 = 0;
            if (y2 < 2000) {
                q = 2000 - y2;
                r2 = q % 28;
                if (r2 != 0) {
                    j2 = y2 - 28 + r2;
                } else j2 = y2;

            } else {
                q = y2 - 2000;
                r2 = q % 28;
                j2 = y2 - r2;


            }
            if (j2 >= j1) {
                if (r1 != 0) {
                    if (y1 < 2000) {
                        if (m1 <= 2) {
                            v1 = r1;
                        } else v1 = r1 - 1;
                        for (int i = 28 - v1; i < ar.length; i++) {
                            ans += ar[i];
                        }
                    } else {
                        if (m1 <= 2) {
                            v1 = r1;
                        } else v1 = r1 + 1;
                        for (int i = v1; i < ar.length; i++) {
                            ans += ar[i];

                        }
                    }
                }
                if (r2 != 0) {
                    if (y2 < 2000) {
                        if (m2 >= 2) {
                            v2 = r2;
                        } else v2 = r2 - 1;
                        for (int i = 0; i <= v2; i++) {
                            ans += ar[i];
                        }
                    } else {

                        if (m2 >= 2) {
                            v2 = r2;
                        } else v2 = r2 - 1;
                        for (int i = 0; i <= v2; i++) {
                            ans += ar[i];
                        }
                    }
                }
                ans += (j2 - j1) / 4;
            } else {
                if (m1 <= 2) {
                    v1 = r1;
                } else v1 = r1 + 1;
                if (m2 >= 2) {
                    v2 = r2;
                } else v2 = r2 - 1;
                for (int i = v1; i <= v2; i++) {
                    ans += ar[i];
                }
            }
            System.out.println(ans);


        }
    }
}
