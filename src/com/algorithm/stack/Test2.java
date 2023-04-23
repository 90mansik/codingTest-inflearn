package com.algorithm.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars1 = sc.nextLine().toCharArray();
        char[] chars2 = sc.nextLine().toCharArray();

        Map<Character, Integer> map1 = getAlpaCntMap(chars1);
        Map<Character, Integer> map2 = getAlpaCntMap(chars2);

        System.out.println(solution(map1, map2));

    }

    private static Map<Character, Integer> getAlpaCntMap(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    private static String solution(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entrySet : map1.entrySet()) {
            if (entrySet.getValue() != map2.get(entrySet.getKey())) {
                return "NO";
            }
        }

        return "YES";
    }

}
