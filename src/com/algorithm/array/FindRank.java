package com.algorithm.array;

import java.util.*;

public class FindRank {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            Integer[] scores = initScores(N, sc);

            Map<Integer, Integer> rankScore = settingScore(scores);
            Map<Integer, Integer> result = getRankResult(scores, rankScore);

            printResult(result, scores);

        }

        private static Integer[] initScores(int n, Scanner sc) {
            Integer[] score = new Integer[n];
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
            }

            return score;
        }

        private static void printResult(Map<Integer, Integer> result, Integer[] scores) {
            for (int i = 0; i < scores.length; i++) {
                System.out.print(result.get(scores[i]) + " ");
            }
        }

        private static Map<Integer, Integer> getRankResult(Integer[] scores, Map<Integer, Integer> rankScore) {
            int rank = 1;
            Map<Integer, Integer> result = new HashMap<>();
            Integer[] sortScore = scores.clone();

            Arrays.sort(sortScore, Collections.reverseOrder());

            for (int i = 0; i < sortScore.length; i++) {
                if(result.containsKey(sortScore[i])){
                    continue;
                }
                for (Map.Entry<Integer, Integer> entrySet : rankScore.entrySet()) {
                    if ( sortScore[i].equals(entrySet.getKey())) {
                        result.put(sortScore[i], rank);
                        break;
                    }
                }
                rank++;
            }

            return result;
        }

        private static Map<Integer, Integer> settingScore(Integer[] scores) {
            HashMap<Integer, Integer> rankScore = new HashMap<>();

            for (int score : scores) {
                rankScore.put(score, 1);
            }

            return rankScore;
        }


}
