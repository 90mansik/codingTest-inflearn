package com.algorithm.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] strs = new String[input];

        for (int i = 0; i < input; i++) {
            strs[i] = sc.next();
        }

        ReverseString reverseString = new ReverseString();
        reverseString.solution(strs);
    }


    /* 문자열을 직접 뒤집기 */
    public void solution(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            String revers = "";
            String str = strs[i];
            for (int j = str.length() - 1; j >= 0; j--) {
                revers = revers + str.charAt(j);
            }
            System.out.println(revers);
        }
    }

    /* StringBuilder를 이용한 문자열 뒤집기 */
    public void solution2(String[] strs){
        StringBuilder sb = new StringBuilder();

        for ( int i=0; i< strs.length; i++){
            System.out.println(sb.append(strs[i]).reverse());
            sb.delete(0,sb.length());
        }
    }

}
