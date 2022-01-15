package T2.다음큰숫자.올바른괄호;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        if(!new Solution().solution("(())()"))
            throw  new RuntimeException("노 정답");
    }

    /*
    시간초과났음
    해결법
    1. 시간이 가장 오래 걸리는 곳을 찾는다
    2. 그걸 없앤다 -> 대부분 Loop문
     String p = String.valueOf(ch);
            if(p.equals("("))
            이부분이 가장 많이 걸림
     valueOf(ch)
     */
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            String p = String.valueOf(ch);
            if(p.equals("(")) {
                stack.push(p);
            }else{
                if(stack.isEmpty())return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
