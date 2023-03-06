package com.algorithm.String;

import java.util.Scanner;

public class StringDecryption {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String inStr = sc.next();

        int len = N * 7;
        int[] binaryNumbers = new int[len];

        for (int i = 0; i < inStr.length(); i++) {
            binaryNumbers[i] = specialCharactersToBinary(inStr, i);
        }

        int result = 0;
        int startIndex = 0;

        while (startIndex < len) {
            result = getDecimalNumber(binaryNumbers, startIndex);
            startIndex = startIndex + 7;
            sb.append((char) result);
        }

        System.out.println(sb.reverse());
    }

    private static int getDecimalNumber(int[] binaryNumbers, int startIndex) {
        int result = 0;
        int k = 1;
        int startPoint = (binaryNumbers.length - startIndex);
        int endPoint = startPoint - 7;

        for (int i = startPoint - 1; i >= endPoint; i--) {
            if (binaryNumbers[i] == 1) {
                result = result + k;
            }
            k = k * 2;
        }
        return result;
    }

    private static int specialCharactersToBinary(String inStr, int i) {
        if (inStr.charAt(i) == '#') {
            return 1;
        }
        return 0;
    }

}
