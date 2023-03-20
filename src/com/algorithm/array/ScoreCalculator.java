package com.algorithm.array;

import java.util.Scanner;

public class ScoreCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = settingScores(N, sc);


        int totalScore = scoreCalculator(scores);

        System.out.println(totalScore);
    }

    private static int[] settingScores(int n, Scanner sc) {
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        return scores;
    }

    private static int scoreCalculator(int[] scores) {
        int totalScore = 0;
        int point = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 1) {
                point++;
            } else {
                point = 0;
            }

            totalScore += point;
        }
        return totalScore;
    }

}
