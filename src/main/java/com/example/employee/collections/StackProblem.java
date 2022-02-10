package com.example.employee.collections;

import java.util.Stack;

public class StackProblem {
    public static void main(String[] args){
        String exp = "[()]{}{[()()]()}";
        System.out.print(isBalanced(exp));
    }

    private static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for(char c: exp.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
       return stack.isEmpty();
    }
}
