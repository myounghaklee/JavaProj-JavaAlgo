package T3.체육복;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int lost[] = {4,3};
        int reserve[] = {3,2};
        System.out.println(s.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int s[] = new int [n];
        Arrays.fill(s,1);

        for(int i : lost) s[i-1] -=1;
        for(int i : reserve) s[i-1] += 1;
        for(int i = 0 ;i<n; i++){
            if(s[i] >0) continue;

            if(i>0 && s[i-1] >1){
                s[i-1] +=1;
                s[i] += 1;
                continue;
            }

            if(i<s.length-1 && s[i+1] >1){
                s[i+1] -= 1;
                s[i]+=1;
            }
        }
        return (int) Arrays.stream(s).filter(i -> i>0).count();
    }
}
