package com.algorithm.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrays1 = setArrays(sc, N);

        int M = sc.nextInt();
        int[] arrays2 = setArrays(sc, M);

        Arrays.sort(arrays1);
        Arrays.sort(arrays2);

        List<Integer> result = solution(arrays1, arrays2);

        printResult(result);
    }

    private static void printResult(List<Integer> result) {
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] setArrays(Scanner sc, int cnt) {
        int[] arrays = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arrays[i] = sc.nextInt();
        }

        return arrays;
    }

    private static List<Integer> solution(int[] arrays1, int[] arrays2) {
        List<Integer> result = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < arrays1.length && index2 < arrays2.length) {

            if (arrays1[index1] == arrays2[index2]) {
                result.add(arrays1[index1]);
                index1++;
                index2++;
            } else if (arrays1[index1] > arrays2[index2]) {
                index2++;
            } else {
                index1++;
            }
        }

        return result;
    }
}
