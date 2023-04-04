package com.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String inStr = sc.next();

        Map<Character, Integer> scoreMap = getScores(inStr);

        char maxKey = getMaxKey(scoreMap);

        System.out.println(maxKey);


    }

    private static char getMaxKey(Map<Character, Integer> scoreMap) {
        int max = Integer.MIN_VALUE;
        char maxKey = ' ';
        for(Map.Entry<Character, Integer> map : scoreMap.entrySet()){
            if(max < map.getValue()){
                max = map.getValue();
                maxKey = map.getKey();
            }
        }
        return maxKey;
    }

    public static Map<Character, Integer> getScores(String inStr) {

        char[] chars = inStr.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
