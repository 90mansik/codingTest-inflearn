package com.algorithm.array;

import java.util.Scanner;

public class FindPrimeNumberCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(getPrimeNumberCount(N));
    }



    public static int getPrimeNumberCount(int N) {
        int count = 0;

        for (int i = 2; i < N; i++) {
            if (isFlag(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isFlag(int i) {

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
