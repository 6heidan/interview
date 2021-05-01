package com.heidan.arithmetic;

import java.util.Stack;

public class Leetcode150逆波兰表达式求值 {
    private boolean isOperator(String token){
        return "+-*/".contains(token);
    }
    private int calculate(Integer right,Integer left,String operator){
        switch (operator){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            default:
                return left/right;
        }
    }

    //["2","1","+","3","*"]
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String token:tokens){
            if (isOperator(token)){
                Integer right = stack.pop();
                Integer left = stack.pop();
                stack.push(calculate(right,left,token));
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

//    public int evalRPN(String[] tokens){
//        Stack<Integer> stack = new Stack<>();
//        for (String token:tokens){
//            stack.push(isOperator(token)
//                    ? calculate(stack.pop(),stack.pop(),token)
//                    : Integer.parseInt(token));
//        }
//        return stack.pop();
//    }

//    public int evalRPN(String[] tokens){
//        Stack<Integer> stack = new Stack<>();
//        for (String token:tokens){
//            switch (token){
//                case "+": {
//                    stack.push(stack.pop() + stack.pop());
//                    break;
//                }
//                case "*": {
//                    stack.push(stack.pop() * stack.pop());
//                    break;
//                }
//                case "-": {
//                    Integer right = stack.pop();
//                    stack.push(stack.pop() - right);
//                    break;
//                }
//                case "/": {
//                    Integer right = stack.pop();
//                    stack.push(stack.pop() / right);
//                    break;
//                }
//                default:
//                    stack.push(Integer.parseInt(token));
//                    break;
//            }
//        }
//        return stack.pop();
//    }
}
