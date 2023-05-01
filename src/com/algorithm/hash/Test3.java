package com.algorithm.hash;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        printLists(result(K, numbers));
    }

    private static void printLists(List<Integer> result) {
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    private static List<Integer> result(int K, int[] numbers) {
        List<Integer> result = new ArrayList<>();
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) {
            cnt += addMapCnt(numbers[i], map);
        }
        result.add(cnt);

        for (int i = K; i < numbers.length; i++) {
            cnt += addMapCnt(numbers[i], map) - removeMapCnt(numbers[i - K], map);
            result.add(cnt);
        }

        return result;
    }

    private static int addMapCnt(int number, Map<Integer, Integer> map) {
        if (!map.containsKey(number)) {
            map.put(number, map.getOrDefault(number, 1) + 1);
            return 1;
        }

        map.put(number, map.getOrDefault(number, 1) + 1);
        return 0;
    }

    private static int removeMapCnt(int number, Map<Integer, Integer> map) {
        if (map.containsKey(number)) {
            map.put(number, map.getOrDefault(number, 1) - 1);
            if (map.get(number) == 1) {
                map.remove(number);
                return 1;
            }
        }


        return 0;
    }


}
