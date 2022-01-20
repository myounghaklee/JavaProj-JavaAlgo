package T2.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int []truck_weights = {10};
        Solution s = new Solution();
        int ans = s.solution(bridge_length,weight,truck_weights);
        System.out.println(ans);


    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int time=0;
        int totalW=0;
        for(int now : truck_weights){
            while(true){
                if(q.isEmpty()){
                    q.add(now);
                    totalW +=now;
                    time++;
                    break;
                }else if(q.size() == bridge_length){
                    totalW-=q.poll();
                }else{
                    if(totalW + now >weight){
                        q.add(0);
                        time++;
                    }else{
                        q.offer(now);
                        totalW+=now;
                        time++;
                        break;
                    }
                }
            }
        }

        return time+bridge_length;
    }
}
