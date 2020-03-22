package codechef;

import java.util.Scanner;

public class breakingbricks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            moves = Integer.MAX_VALUE;
            int s = scn.nextInt();
            int[] ar = new int[3];
            for (int i = 0; i < 3; i++) {
                ar[i] = scn.nextInt();
            }
            find(s, ar, 0, 2, 0);
            System.out.println(moves);
        }
    }

    static int moves = Integer.MAX_VALUE;

    private static void find(int s, int[] ar, int i, int i1, int ans) {
        if (i > i1) {
            if (ans < moves) {
                moves = ans;
            }
            return;
        }
        int sumf = 0;
        int sumb = 0;
        int k = i;
        while (k <= i1) {
            sumf += ar[k];
            if(sumf>s){
                break;
            }
            else k++;

        }

        find(s, ar, k, i1, ans + 1);
        k = i1;
        while (k>=i) {
            sumb += ar[k];
            if(sumb>s)
            break;
            else k--;

        }

        find(s, ar, i, k, ans + 1);
    }
}

