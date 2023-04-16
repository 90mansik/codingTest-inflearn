package com.algorithm.dynamicProgramming;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numberOfCases = new int[N + 1];

        numberOfCases[1] = 1;       // 첫번째 계단을 오를 수 있는 경우의 수
        numberOfCases[2] = 2;       // 두번째 게단을 오를 수 있는 경우의 수
        for (int i = 3; i <= N; i++) {
            numberOfCases[i] = numberOfCases[i - 2] + numberOfCases[i - 1];
        }

        System.out.println(numberOfCases[N]);
    }
}
