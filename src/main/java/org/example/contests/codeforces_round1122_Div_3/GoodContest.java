package org.example.contests.codeforces_round1122_Div_3;

import java.util.Scanner;

public class GoodContest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int min = n;
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                min = Math.min(min, a);
            }

            System.out.println(n-min);
        }
    }
}
