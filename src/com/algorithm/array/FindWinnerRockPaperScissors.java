package com.algorithm.array;

import java.util.HashMap;
import java.util.Scanner;

public class FindWinnerRockPaperScissors {
    public static void main(String[] args) {

        // play1이 이길 수 있는 경우
        // play1 / play2 = 1 / 3, 2 / 1, 3 / 2

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] player1 = settingPlayer(N, sc);
        int[] player2 = settingPlayer(N, sc);

        for(int i=0; i<N; i++){
            System.out.println(findWinner(player1[i], player2[i]));
        }

    }

    public static int[] settingPlayer(int N, Scanner sc){
        int[] a = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static String findWinner(int source, int target){

        HashMap<Integer, Integer> hashMap = getWinnerCase();

        if(source == target){
            return "D";
        }


        if(hashMap.get(source) == target){
            return "A";
        }else{
            return "B";
        }

    }


    public static HashMap<Integer, Integer> getWinnerCase(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 3);
        hashMap.put(2,1);
        hashMap.put(3,2);

        return hashMap;
    }

}
