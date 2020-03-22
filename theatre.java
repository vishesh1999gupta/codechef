package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class theatre {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int sum = 0;
        while (t-- > 0) {
            int n = scn.nextInt();
            int max = Integer.MIN_VALUE;
//            if(n==0){
//                max=-400;
//            }
            int[][] arr = new int[4][4];
            for (int i = 0; i < n; i++) {
                char ch = scn.next().charAt(0);
                int val = scn.nextInt();
                arr[ch - 65][(val - 3) / 3]++;
            }
//            for (int i = 0; i < 4; i++) {
//                System.out.println(Arrays.toString(arr[i]));
//            }
            int[] ans = new int[4];
            int count = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j != i) {
                        for (int k = 0; k < 4; k++) {
                            if (k != i && k != j) {

                                for (int l = 0; l < 4; l++) {
                                    if (l != i && l != j && l != k) {

                                        count++;
                                        ans[0] = arr[0][i];
                                        ans[1] = arr[1][j];
                                        ans[2] = arr[2][k];
                                        ans[3] = arr[3][l];
                                        Arrays.sort(ans);

                                        int vals = 0;
                                        for (int x = 0; x < 4; x++) {
                                            if (ans[x] != 0) {
                                                vals += ans[x] * 25 * (x + 1);
                                            } else vals = vals - 100;
                                        }
                                        if (vals > max) {
                                            max = vals;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(max);
            sum += max;
        }
        System.out.println(sum);

    }
}
