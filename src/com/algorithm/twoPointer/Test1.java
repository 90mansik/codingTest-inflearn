package com.algorithm.twoPointer;

import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array1 = getArray1(sc, N);

        int M = sc.nextInt();
        int[] array2 = getArray2(sc, M);

        int[] result = solution2(N, array1, M, array2);

        System.out.println(resultToString(result));
    }

    private static String resultToString(int[] result) {
        String str = "";

        for (int i = 0; i < result.length; i++) {
            str = str + result[i] + " ";
        }

        return str;
    }

    private static int[] getArray2(Scanner sc, int M) {
        int[] array2 = new int[M];

        for (int i = 0; i < M; i++) {
            array2[i] = sc.nextInt();
        }
        return array2;
    }

    private static int[] getArray1(Scanner sc, int N) {
        int[] array1 = new int[N];

        for (int i = 0; i < N; i++) {
            array1[i] = sc.nextInt();
        }
        return array1;
    }


    private static int[] solution2(int N, int[] array1, int M, int[] array2) {
        int[] result = new int[N + M];
        int index = 0;
        int iIndex = 0;
        int jIndex = 0;

        while (iIndex < array1.length-1 && jIndex < array2.length-1) {

            if (array1[iIndex] < array2[jIndex]) {
                result[index++] = array1[iIndex++];
            } else {
                result[index++] = array2[jIndex++];
            }


        }

        while (iIndex < array1.length) {
            result[index++] = array1[iIndex++];
        }

        while (jIndex < array2.length) {
            result[index++] = array2[jIndex++];
        }

        return result;
    }

}
