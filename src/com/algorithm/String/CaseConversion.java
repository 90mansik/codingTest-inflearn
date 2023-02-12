package com.algorithm.String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CaseConversion {

    public static void main(String[] args) {
        CaseConversion caseConversion = new CaseConversion();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (caseConversion.isValid(input)) {
            System.out.println(caseConversion.Solution(input));
        } else {
            System.out.println("유효성 검증 실패");
        }
    }

    public String Solution(String str) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }

    public boolean isValid(String str) {
        if (Pattern.matches("^[a-zA-Z]*$", str) && str.length() < 100) {
            return true;
        }
        return false;
    }
}
