package T3.더맵게;

import java.util.Comparator;
import java.util.LinkedList;

public class Solution2 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int sco[] = {1, 2, 3, 9, 10, 12};
        int ans = s.solution(sco, 7);
        System.out.println(ans);
    }
    public int solution(int[] scoville, int K) {
        LinkedList<Integer>scov = new LinkedList<>();
        for(int s : scoville)scov.add(s);

        scov.sort(Comparator.naturalOrder());

        int ans = 0;
        while(scov.getFirst() <K && scov.size()>=2){
            int newScov = scov.remove(0) + scov.remove(0)*2;
            scov.add(newScov);
            scov.sort(Comparator.naturalOrder());
            ans ++;
        }
        if(scov.getFirst() < K )return -1;

        return ans;
    }
}
