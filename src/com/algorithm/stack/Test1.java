package com.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        Stack<Character> stack = solution(chars);

        System.out.println(getResult(stack));
    }

    private static Stack<Character> solution(char[] chars) {
        Stack<Character> stack = new Stack<>();

        for (char ch : chars) {
            if (ch == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()){
                    stack.push('N');
                    return stack;
                }
                stack.pop();
            }


        }
        return stack;
    }

    private static String getResult(Stack<Character> stack) {
        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }
}
