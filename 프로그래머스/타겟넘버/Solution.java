package T3.타겟넘버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    private static char calculate[] = {'+', '-'};
    private static int ans =0;


    public int solution(int[] numbers, int target) {

        Stack <Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i : numbers){
            s.add(i);
            q.add(i);
        }
        bfs(q,target, 0 );

        return ans;
    }

    public void bfs(Queue<Integer> q, int target, int now) {
        System.out.println("in  " + now +" "+  q.size() + " " + q.peek());
        //기저조건
        if((now == target) && q.size()==0) {
            System.out.println("기저조건 ind : " );
            ++ans;
            return;
        }
            while (!q.isEmpty()) {

                int minus = q.poll() * (-1);
                int plus = minus * (-1);
                //int a = plus + now;
                //int b = minus + now;
                //System.out.println("a 랑 b : " + a + " " + b);
                bfs(q, target, now+ plus);
                bfs(q, target,now+minus);

                //q.add(plus+now);q.add(minus+now);
            }

    }
}
