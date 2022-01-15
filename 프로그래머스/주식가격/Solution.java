package T2.주식가격;

public class Solution {

    public static void main(String[] args) {
        int prices[] = {1, 2, 3, 2, 3};
        Solution solution = new Solution();
        int ans[] = solution.solution(prices);
        for(int i = 0; i< ans.length; i++){
            System.out.println(ans[i] + " " );
        }
    }
    public int[] solution(int[] prices) {
        int leng = prices.length;
        int[] answer = new int [leng];
        for(int i =0; i<leng; i++){
            int nowStock = prices[i];
            int cnt = 0;
            for(int j = i+1; j<leng; j++){
                if(nowStock > prices[j]) {
                    System.out.println(nowStock + " " + prices[j]);
                    continue;
                }
                cnt++;

            }//end j loop
            if(i==leng-1) cnt = 0;
            answer[i]= cnt;
        }//end i loop
        return answer;
    }

}
