package T2.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;

public class Solution4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = {"stanko", "ana", "mislav"};

        String ans = s.solution(participant, completion);
        System.out.println(ans);
    }

    public  String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))return participant[i];
        }

        return participant[participant.length-1];
    }
}
