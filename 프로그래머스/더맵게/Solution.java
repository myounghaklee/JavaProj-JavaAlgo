package T3.더맵게;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int sco[] = {1, 2, 3, 9, 10, 12};
        int ans = s.solution(sco, 7);
        System.out.println(ans);
    }
    public int solution(int[] scoville, int K) {
        Arrays.sort(scoville);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i< scoville.length; i++){
            q.add(scoville[i]);
        }
        int cnt=0;
        int answer = 0;
        while(true){
            if(q.peek()>K) break;
            if(q.size()==1 && q.peek()<K ) {
                answer = -1;
                break;
            }
            int first = q.poll();
            int second = q.poll();
            int mix = first + second*2;
            q.add(mix);
            answer++;

        }

        return answer;
    }
}
