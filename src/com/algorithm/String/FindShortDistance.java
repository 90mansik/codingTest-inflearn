package com.algorithm.String;

import java.util.Scanner;

public class FindShortDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        String[] inStrs = inStr.split(" ");

        int[] result = new int[inStrs[0].length()];
        int cnt = inStrs[0].split(inStrs[1]).length;
        int index = 0;

        for(int i=0; i< cnt; i++){
            for(int j=0; j< result.length; j++){
                int distance = getDistance(inStrs[0].indexOf(inStrs[1], index), j);

                if( i == 0 || result[j] > distance ){
                    result[j] = distance;
                }
            }
            index = inStrs[0].indexOf(inStrs[1], index) + 1;
        }

        System.out.println(printResult(result));

    }

    public static int getDistance(int source, int target){
        return Math.abs(source - target);
    }

    public static String printResult(int[] result){
        String str = "";
        for(int i=0; i<result.length; i++){
            if(result.length == i){
                str = str + result[i];
            }else{
                str = str + result[i] + " ";
            }
        }

        return str;
    }

}
