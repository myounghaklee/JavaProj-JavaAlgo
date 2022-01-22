package T2.위장;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"},
                {"smoky_makeup", "face"}};

        int ans = s.solution(clothes);
        System.out.println(ans);
    }
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        int oneType =1;
        int onlyOneChk=1;
        //종류별로 한개씩 넣기
        for(int i =0; i< clothes.length; i++){
            map.put(clothes[i][1] ,map.getOrDefault(clothes[i][1] ,0)+1);
            //System.out.println(clothes[i][1] + " " +   map.get(clothes[i][1]));
            if(map.size()!=1) oneType++;
            if(map.get(clothes[i][1])!=1)onlyOneChk++;
        }

        if(oneType==1){ //한타입의 옷만 있을때
            //System.out.println("in 시벌");
            for(String key : map.keySet()){
                answer= map.get(key);
            }
          return answer;
        }
        if(onlyOneChk==1){//종류별로 한개씩 있을때는 부분집합의 수
            answer = (int)Math.pow(2, map.size()) -1;
            return answer;
        }


            for(String key : map.keySet()){
                answer*= map.get(key);
            }
            for(String key : map.keySet()){
                answer+= map.get(key);
            }
        return answer;
    }
}
