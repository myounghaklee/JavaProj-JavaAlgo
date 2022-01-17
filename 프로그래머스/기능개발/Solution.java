package T2.기능개발;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};

        int[] speeds = {1, 1, 1, 1, 1, 1};
        int ans [] = s.solution(progresses,speeds);
        for (int i =0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }


    }
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> tmp = new ArrayList<>();
        for(int i= 0; i< progresses.length; i++){
            //q.add((int)Math.ceil((100-progresses[i])/speeds[i])); //남은일수를 계산하여 큐에 남은일수만 넣음
            q.add(5);q.add(1);q.add(2);q.add(3);
        }
        int extraDay = q.peek();
        while(!q.isEmpty()){

            System.out.println(extraDay + "=====");
            int cnt =1;
            if(extraDay>=q.peek()){
                cnt++; //하루씩 증가
                System.out.println(extraDay + " " + q.peek() + " " + cnt);
                 q.poll();
                //System.out.println(poll + "===============");
            }else{
                extraDay= q.peek();
                tmp.add(cnt);
                cnt=0;
            }
            //q.clear();
            tmp.add(cnt);

        }
        int[] answer = new int [tmp.size()];
        for( int i =0 ;i< tmp.size(); i++){
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}
