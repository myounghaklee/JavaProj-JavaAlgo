package T3.타일링2n;

public class Solution {
    public int solution(int n) {
        long []memo = new long [n+1];
        if(n>1) {
            memo[0] = 0; memo[1] =1; memo[2] = 2;
        }
        else{
            memo[0] = 0; memo[1] = 1;
        }
        for(int i = 3; i<n+1; i++){
            memo[i] = (memo[i-1]+ memo[i-2])%1000000007;
        }

        return (int)memo[n];
    }


}
