package com.algorithm.String;

import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next().toLowerCase();
        char secondStr = sc.next().toLowerCase().charAt(0);

        FindString fs = new FindString();
        System.out.println(fs.solution(firstStr, secondStr));


    }
    public int solution(String str, char findCh) {
        int answer = 0;

        for (char ch : str.toCharArray()) {
            if (ch == findCh) {
                answer++;
            }
        }
        return answer;
    }
}
