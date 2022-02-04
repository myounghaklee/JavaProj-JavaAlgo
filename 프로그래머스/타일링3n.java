package T4;

public class 타일링3n {
    public int solution(int n) {
        int answer = 0;
        int mod = 1000000007;
        long[] dp = new long[5001];

        dp[0] = 1;
        dp[2] = 3;
        for(int i=4; i<=n; i+=2){
            dp[i] = dp[i-2] * 3;
            for(int j=i-4; j>=0; j-=2){
                dp[i] += dp[j] * 2;
            }
            dp[i] = dp[i] % mod;
        }

        answer = (int) dp[n];
        return answer;
        /*long []memo = new long [n+1];
        if(n>1) {
            memo[0] = 0; memo[1] =1; memo[2] = 2;
        }
        else{
            memo[0] = 0; memo[1] = 1;
        }
        for(int i = 3; i<n+1; i++){
            memo[i] = (memo[i-1]+ memo[i-2])%1000000007;
        }

        return (int)memo[n];*/
    }
}
