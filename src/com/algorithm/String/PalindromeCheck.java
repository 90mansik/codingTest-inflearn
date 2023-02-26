package com.algorithm.String;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inSb = new StringBuilder(sc.nextLine().toLowerCase());

        String result = checkPalindrome(inSb.toString(), inSb.reverse().toString());
        System.out.println(result);
    }
    private static String checkPalindrome(String sourceStr , String targetStr) {
        if (sourceStr.equals(targetStr)) {
            return "YES";
        }
        return "NO";
    }

}
