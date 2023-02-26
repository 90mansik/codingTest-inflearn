package com.algorithm.String;

import java.util.Scanner;

public class RemoveDuplicationString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            result += getNotDuplicationString(inStr, i);
        }
        System.out.println(result);
    }

    private static String getNotDuplicationString(String inStr,  int i) {
        if(inStr.indexOf(inStr.charAt(i)) == i){
            return String.valueOf(inStr.charAt(i));
        }
        return "";
    }

}
