package com.algorithm.array;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() ;

        int[] result= getFibonacciNumbers(N);

        getPrintResult(result);

    }

    private static int[] getFibonacciNumbers(int N) {
        int[] result = new int[N];

        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i< N; i++){
            result[i] = result[i-1] + result[i-2];
        }

        return result;
    }

    private static void getPrintResult(int[] result){
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

}
