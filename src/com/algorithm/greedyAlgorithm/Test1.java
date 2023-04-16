package com.algorithm.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Player> players = addPlayers(sc, N);

        Collections.sort(players);

        System.out.println(solution(players));

    }

    private static int solution(List<Player> players) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < players.size(); i++) {
            int weight = players.get(i).getWeight();

            if (weight > max) {
                max = weight;
                result++;
            }
        }

        return result;
    }

    private static List<Player> addPlayers(Scanner sc, int N) {

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            players.add(new Player(height, weight));
        }

        return players;
    }

    public static class Player implements Comparable<Player> {

        private final int height;
        private final int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Player o) {
            return o.height - this.height;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
    }
}


