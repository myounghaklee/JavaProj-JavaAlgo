package T2.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = {"stanko", "ana", "mislav"};

        String ans = s.solution(participant, completion);
        System.out.println(ans);
    }

    public  String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String p : participant)
            map.put(p, map.getOrDefault(p,0)+1);

        for(String c : completion){
            int cnt = map.get(c)-1;
            if(cnt==0){
                map.remove(c);
                continue;
            }
            map.put(c,cnt);
        }
        return map.keySet().iterator().next();
    }
}
