package 임수빈.programers.prob12909;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : chars){
            if(ch == '('){
                stack.push(ch);
            }else {
                try {
                    stack.pop();
                }catch (Exception e){
                    return false;
                }
            }
        }
        if(!stack.isEmpty())return false;
        else return true;
    }
}