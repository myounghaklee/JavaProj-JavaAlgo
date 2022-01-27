package T3.타겟넘버;

import java.util.Stack;

public class Solution {
    private static char calculate[] = {'+', '-'};
    private static int ans =0;
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] num = {1, 1, 1, 1, 1};

        int ans1 = s.solution(num, 3);

        System.out.println(ans1);
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        Stack <Integer> s = new Stack<>();
        for(int i : numbers)s.add(i);
        bfs(s,target, 0 );
        return ans;
    }

    private void bfs(Stack<Integer> s, int target, int cnt) {
        if(cnt == target) {
            ans++;
            return;
        }
        while(s.isEmpty()){
            int first = s.pop();
            int second = s.pop();
            int plus = first+second;
            int minus=first-second;

            bfs(s, target, plus);
            bfs(s, target, minus);
            s.add(plus);s.add(minus);
        }
    }
}
