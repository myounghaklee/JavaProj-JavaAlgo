package T2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {


    public int[] solution(int[] progresses, int[] speeds) {
        //각 작업에 필요한 날짜로 초기화한 큐
        Queue<Integer> need_day = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            need_day.offer((int)Math.ceil((double)(100-progresses[i])/speeds[i]));
        }

        int front = need_day.peek();    //비교할 앞의 작업의 날짜
        int num=0;  //리스트에 추가할 원소
        List<Integer> list = new ArrayList<Integer>();  //answer에 담을 리스트

        //큐가 빌 때까지 반복
        while(!need_day.isEmpty()){
            //뒤의 작업이 front보다 작으면, 함께 배포할 수 있는 기능이 +1
            if(front>=need_day.peek()){
                need_day.poll();
                num++;
            }else{
                //함께 배포하지 못함. 다음 작업이 완성될 때까지 배포를 기다려야함
                front = need_day.peek();
                list.add(num);
                num=0;
            }
        }

        //마지막으로 배포할 기능의 개수까지 리스트에 추가
        list.add(num);

        int[] answer =new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }


}
