package T2.다음큰숫자.올바른괄호;

public class Solution2 {
    public static void main(String[] args) {
        if(!new Solution().solution("(())()"))
            throw  new RuntimeException("노 정답");
    }

    /*
    시간초과났음
    해결법
    1. 시간이 가장 오래 걸리는 곳을 찾는다
    2. 그걸 없앤다 -> 대부분 Loop문

    이코드에서는 push > pop순으로 오버헤드가 크다
     */
    boolean solution(String s) {
        int stackCount=0;
        for(char ch : s.toCharArray()){
            //String p = String.valueOf(ch);
            if(ch=='(') {
                stackCount ++;
            }else{
                if(stackCount==0)return false;
                stackCount--;
            }
        }
        return stackCount==0;
    }
}
