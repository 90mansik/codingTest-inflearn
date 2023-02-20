package com.algorithm.String;

import java.util.Scanner;

public class IndexOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        IndexOfString inputOfString = new IndexOfString();
        System.out.println(inputOfString.solution(inputStr));

    }

    public String solution(String str) {
        String[] strArray = str.split(" ");
        int sLength = 0;
        String result = "";

        for (String s : strArray) {
            if (s.length() > sLength) {
                sLength = s.length();
                result = s;
            }
        }
        return result;
    }

}
