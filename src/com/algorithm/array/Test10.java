package com.algorithm.array;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] array = new int[N][N];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, array));

    }

    public static int solution(int N, int[][] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (isCurMax(array, i, j)) {
                    count++;
                }

            }

        }
        return count;
    }

    public static boolean isCurMax(int[][] array, int i, int j) {
        int up = 0;
        int down = 0;
        int right = 0;
        int left = 0;
        int max = array[i][j];

        // 위쪽
        if (i - 1 >= 0) {
            up = array[i - 1][j];

        }
        // 아래
        if (i + 1 < array.length) {
            down = array[i + 1][j];

        }
        // 좌
        if (j - 1 >= 0) {
            left = array[i][j - 1];
        }
        // 우
        if (j + 1 < array.length) {
            right = array[i][j + 1];
        }

        if( array[i][j] > up && array[i][j] > down && array[i][j] > left && array[i][j] > right  ){
            return true;
        }

        return false;
    }
}
