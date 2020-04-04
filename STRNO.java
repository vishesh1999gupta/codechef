package codechef;

import java.util.Scanner;

public class STRNO {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int x = scn.nextInt();
            int k = scn.nextInt();
            int count = 0;
            int sum = 0;
            if (x % 2 == 0) {
                while (!(x%2>0)) {
                    x >>=1;
                    sum++;
                }
            }


                for (int i = 3; i * i <= x  ; i += 2) {
                    if (x % i == 0) {
                        while (x % i == 0) {
                            x = x / i;
                            sum++;
                        }
                    }
                }
                if(x>2){
                    sum++;
                }

            if(k<=sum){
                System.out.println(1);
            }
            else System.out.println(0);

        }

    }
}
