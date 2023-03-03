package com.algorithm.String;

import java.util.Scanner;

public class FindOnlyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();

        char[] inChars = replaceNumber(inStr).toCharArray();
        int j = 1;
        int result = 0;

        for (int i = inChars.length - 1; i >= 0; i--) {
            int number = Integer.parseInt(Character.toString(inChars[i]));
            result = result + number * j;
            j = j * 10;
        }

        System.out.println(result);
    }

    public static String replaceNumber(String str) {
        return str.replaceAll("[^0-9]", "");
    }

}
