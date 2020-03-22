package codechef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class hardseq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[128];
        for (int i = 2; i < 128; i++) {
            int idx = -1;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] == arr[i - 1]) {
                    idx = j;
                }
            }
            if (idx == -1) {
                arr[i] = 0;
            } else {
                arr[i] = i - 1 - idx;
            }
        }
        System.out.println(Arrays.toString(arr));
        int t = scn.nextInt();
        while (t-- > 0) {
            int k = scn.nextInt() - 1;
            int count = 0;
            for (int i = 0; i <= k; i++) {
                if (arr[i] ==arr[k])
                    count++;
            }
            System.out.println(count);
        }



    }
}
