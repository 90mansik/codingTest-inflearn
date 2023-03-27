package com.algorithm.array;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int rowColumnMax = 0;
        int diagonalMax = 0;

        rowColumnMax = getRowColumnMax(array);              // 행,열 합 구하기
        diagonalMax = getDiagonalMax(array);                // 대각선합
        int max = Math.max(rowColumnMax, diagonalMax);

        System.out.println(max);
    }

    private static int getDiagonalMax(int[][] array) {
        int sum1 =0;
        int sum2 = 0;
        for(int i = 0; i< array.length; i++){
            sum1 = sum1+ array[i][i];    // 왼쪽에서 아래로 내려오는 대각선
            sum2 = sum2+ array[i][array.length-1-i];       //왼쪽에서 위로 올라가는 대각선
        }

        int sumMax = sum1 > sum2 ? sum1 : sum2;
        return sumMax;
    }

    private static int getRowColumnMax(int[][] array) {
        int max = 0;
        for(int i = 0; i< array.length; i++){
            int rowSum = 0;
            int columnSum = 0;

            for(int j = 0; j< array[0].length; j++){
                rowSum = rowSum + array[i][j];
                columnSum = columnSum + array[j][i];
            }
            max = Math.max(max,  rowSum > columnSum ? rowSum : columnSum);
        }

        return max;
    }
}
