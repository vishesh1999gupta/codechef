package codechef;

import java.util.Scanner;

public class ADASHOP2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int r = scn.nextInt();
            int c = scn.nextInt();
            if (r == c && r != 1) {
                System.out.println(26);
                System.out.println(1 + " " + 1);
                System.out.println(2 + " " + 2);
                System.out.println(1 + " " + 3);
                System.out.println(3 + " " + 1);
                System.out.println(2 + " " + 2);
                System.out.println(3 + " " + 3);
                System.out.println(5 + " " + 1);
                System.out.println(1 + " " + 5);
                System.out.println(3 + " " + 3);
                System.out.println(4 + " " + 4);
                System.out.println(7 + " " + 1);
                System.out.println(1 + " " + 7);
                System.out.println(4 + " " + 4);
                System.out.println(5 + " " + 5);
                System.out.println(2 + " " + 8);
                System.out.println(8 + " " + 2);
                System.out.println(5 + " " + 5);
                System.out.println(6 + " " + 6);
                System.out.println(4 + " " + 8);
                System.out.println(8 + " " + 4);
                System.out.println(6 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(6 + " " + 8);
                System.out.println(8 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(8 + " " + 8);
            } else if (r == c && r == 1) {
                System.out.println(25);
//                System.out.println(1+" "+1);
                System.out.println(2 + " " + 2);
                System.out.println(1 + " " + 3);
                System.out.println(3 + " " + 1);
                System.out.println(2 + " " + 2);
                System.out.println(3 + " " + 3);
                System.out.println(5 + " " + 1);
                System.out.println(1 + " " + 5);
                System.out.println(3 + " " + 3);
                System.out.println(4 + " " + 4);
                System.out.println(7 + " " + 1);
                System.out.println(1 + " " + 7);
                System.out.println(4 + " " + 4);
                System.out.println(5 + " " + 5);
                System.out.println(2 + " " + 8);
                System.out.println(8 + " " + 2);
                System.out.println(5 + " " + 5);
                System.out.println(6 + " " + 6);
                System.out.println(4 + " " + 8);
                System.out.println(8 + " " + 4);
                System.out.println(6 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(6 + " " + 8);
                System.out.println(8 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(8 + " " + 8);
            } else {

                System.out.println(27);
                System.out.println((r + c) / 2 + " " + (r + c) / 2);
                System.out.println(1 + " " + 1);
                System.out.println(2 + " " + 2);
                System.out.println(1 + " " + 3);
                System.out.println(3 + " " + 1);
                System.out.println(2 + " " + 2);
                System.out.println(3 + " " + 3);
                System.out.println(5 + " " + 1);
                System.out.println(1 + " " + 5);
                System.out.println(3 + " " + 3);
                System.out.println(4 + " " + 4);
                System.out.println(7 + " " + 1);
                System.out.println(1 + " " + 7);
                System.out.println(4 + " " + 4);
                System.out.println(5 + " " + 5);
                System.out.println(2 + " " + 8);
                System.out.println(8 + " " + 2);
                System.out.println(5 + " " + 5);
                System.out.println(6 + " " + 6);
                System.out.println(4 + " " + 8);
                System.out.println(8 + " " + 4);
                System.out.println(6 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(6 + " " + 8);
                System.out.println(8 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(8 + " " + 8);
            }
        }
    }

}

