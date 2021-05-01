package com.heidan.datastructure;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 注意空字符串可被认为是有效字符串。
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='('){
                stack.push(')');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else if (stack.isEmpty() || c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
