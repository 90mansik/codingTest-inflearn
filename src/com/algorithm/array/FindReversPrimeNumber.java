package com.algorithm.array;

import java.util.Scanner;

public class FindReversPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = initNumbers(N, sc);
        int[] reversNumbers = getReversNumbers(numbers);

        printPrimeNumbers(reversNumbers);

    }

    private static void printPrimeNumbers(int[] reversNumbers) {
        for(int i=0; i<reversNumbers.length; i++){
            if(isFlag(reversNumbers[i])){
                System.out.print(reversNumbers[i]+" ");
            }
        }
    }

    private static int[] initNumbers(int N, Scanner sc) {
        int[] initNumbers = new int[N];
        for(int i=0; i<N; i++){
            initNumbers[i] = sc.nextInt();
        }

        return initNumbers;
    }

    private static int[] getReversNumbers(int[] numbers) {
        int[] reversNumbers = new int[numbers.length];


        for (int i=0; i<numbers.length; i++){
            StringBuilder sb = new StringBuilder(String.valueOf(numbers[i]));
            reversNumbers[i] = Integer.parseInt(sb.reverse().toString());
        }

        return reversNumbers;
    }

    private static boolean isFlag(int i) {
        if(i == 1){
            return false;
        }

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0 ) {
                return false;
            }
        }
        return true;
    }
}
