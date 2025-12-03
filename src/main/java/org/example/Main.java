package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int h = sc.nextInt();
            int d = sc.nextInt();

            int move = 0;
            int rest = 0;
            int cSteps = 0;

            for (int i = 0; i < d;) {
                cSteps +=1;
                if(h - cSteps > 0){
                    move++;
                    h = h - cSteps;

                    i++;
                }
                else {
                    rest++;
                    h++;
                    cSteps = 0;
                }
            }
            System.out.println(move+rest);


        }
    }
}