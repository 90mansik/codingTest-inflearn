package com.algorithm.String;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inStr = sc.nextLine();

        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            int cnt = 1;
            sb.append(ch);

            for (int j = i + 1; j < inStr.length(); j++) {
                if (inStr.charAt(j) == ch) {
                    cnt++;
                    i++;
                } else {
                    break;
                }
            }

            if (cnt > 1) {
                sb.append(cnt);
            }
        }

        System.out.println(sb.toString());
    }

}
