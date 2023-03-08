package com.algorithm.array;

import java.util.Scanner;

public class FindViewCntStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] students = new int[N];

        for (int i = 0; i < N; i++) {
            students[i] = sc.nextInt();
        }

        System.out.println(getViewCntStudent(students));

    }

    private static int getViewCntStudent(int[] students) {
        int maxHeight = 0;
        int cnt = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] > maxHeight) {
                maxHeight = students[i];
                cnt++;
            }
        }
        return cnt;
    }

}
