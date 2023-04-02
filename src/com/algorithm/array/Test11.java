package com.algorithm.array;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] array = new int[N + 1][6];

        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=5; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, array));

    }


    public static int solution(int N, int[][] array) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <=N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (array[i][k] == array[j][k]) {
                        cnt++;
                        break;
                    }

                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;

    }
}
