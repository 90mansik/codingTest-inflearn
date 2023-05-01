package com.algorithm.twoPointer;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] numbers = getInts(sc, N);
        int maxSum = getMaxSum(K, numbers);


        System.out.println(maxSum);
    }

    private static int[] getInts(Scanner sc, int N) {
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    private static int getMaxSum(int K, int[] numbers) {
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < K; i++) {
            sum += numbers[i];
        }
        maxSum = sum;

        for (int i = K; i < numbers.length; i++) {
            sum += numbers[i] - numbers[i - K];
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        return maxSum;
    }
}
