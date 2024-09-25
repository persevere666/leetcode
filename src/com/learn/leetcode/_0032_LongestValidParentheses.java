package com.learn.leetcode;
import java.util.Stack;;
public class _0032_LongestValidParentheses {

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("i="+i+",c="+c);
            if(c=='('){
                System.out.println("  push");
                stack.push(i);
            }else{
                if(!stack.isEmpty() && s.charAt(stack.peek())=='('){
                    System.out.println("  not empty, pop");
                    stack.pop();
                    if(stack.isEmpty()){
                        maxLen = Math.max(maxLen,i+1);
                        System.out.println("    empty, maxLen="+maxLen);
                    }else{
                        int left = stack.peek();
                        maxLen = Math.max(maxLen,i-left);
                        System.out.println("    not empty, left="+left+",maxLen="+maxLen);
                    }
                }else{
                    System.out.println("  push");
                    stack.push(i);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        _0032_LongestValidParentheses solution = new _0032_LongestValidParentheses();
        String s = "(()";
        int maxLen = solution.longestValidParentheses(s);
        System.err.println(maxLen);
    }
}