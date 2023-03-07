package com.algorithm.array;

import java.util.Scanner;

public class FindLargerNumberThanPreviousOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(findLargerNumberThanPreviousOne(numbers));

    }

    public static String findLargerNumberThanPreviousOne(int[] numbers) {

        StringBuilder sb = new StringBuilder();
        sb.append(numbers[0] + " ");

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                sb.append(numbers[i] + " ");
            }
        }

        return sb.toString();
    }
}
