package com.algorithm.String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseString2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inStr = sc.nextLine();
        char[] inChars = inStr.toCharArray();
        char[] result = new char[inChars.length];

        int j = inChars.length - 1;

        for (int i = 0; i < inChars.length; i++) {
            if (isMatchExp(inChars[i])) {
                result[i] = inChars[i];
            } else {
                boolean flag = true;
                do {
                    if (!isMatchExp(inChars[j])) {
                        result[i] = inChars[j];
                        flag = false;
                    }
                    j--;
                } while (flag);
            }
        }

        System.out.println(String.valueOf(result));

    }

    private static boolean isMatchExp(char ch) {
        String expression = "[!@#$%^&*(),.?\":{}|<>]";
        Pattern pattern = Pattern.compile(expression);

        if (pattern.matcher(String.valueOf(ch)).find()) {
            return true;
        }
        return false;
    }

}
