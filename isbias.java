package codechef;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class isbias {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int q = scn.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scn.nextInt();
        }
        int[] ans = new int[n];
        for (int i = 1; i < n - 1; i++) {
            if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {
                ans[i] = 1;
            }
            if (ar[i] < ar[i - 1] && ar[i] < ar[i + 1]) {
                ans[i] = -1;
            }
        }
        if (ar[n - 1] > ar[n - 2]) {
            ans[n - 1] = 1;
        } else {
            ans[n - 1] = -1;
        }
        int[] ans2 = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ans[i];
            ans2[i] = sum;
        }
        while (q-- > 0) {
            int l = scn.nextInt() - 1;
            int r = scn.nextInt() - 1;
            int val = 0;
            val = ans2[r] - ans2[l];


            if (ans[r] == 0) {
                if (ar[r] > ar[r - 1]) {
                    val += 1;
                } else {
                    val += -1;
                }
            }
            if (val == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    // 8 5
//10 30 50 27 49 72 48 27
    private static boolean check(int[] ar, int l, int r) {
        int count1 = 0;
        int count2 = 0;
        for (int i = l; i < r; ) {
            int p = i + 1;
            if (ar[p] > ar[p - 1]) {
                while (p <= r) {
                    if (ar[p] > ar[p - 1]) {
                        p++;
                    } else {
                        i = p - 1;
                        count1++;
                        break;
                    }
                }
                if (p > r) {
                    count1++;
                    break;
                }
            } else if (ar[p] < ar[p - 1]) {
                while (p <= r) {
                    if (ar[p] < ar[p - 1]) {
                        p++;
                    } else {
                        i = p - 1;
                        count2++;
                        break;
                    }
                }
                if (p > r) {
                    count2++;
                    break;
                }
            }


        }
        if (count1 == count2) {
            return true;
        } else return false;
    }
}
