package T2.주식가격;

import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        int prices[] = {1, 2, 3, 2, 3}; //3, 5, 5, 4, 1  1, 2, 3, 2, 3
        Solution solution = new Solution();
        int ans[] = solution.solution(prices);
        for(int i = 0; i< ans.length; i++){
            System.out.print(ans[i] + " " );
        }
    }
    public int[] solution(int[] prices) {

        int leng = prices.length;
        Stack <Integer> s = new Stack<>();
        int[] answer = new int [leng];

        for(int i=0; i<leng; i++){
            while(!s.isEmpty() && prices[i] < prices[s.peek()]){
                answer[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            answer[s.peek()] = prices.length - s.peek()-1;
            s.pop();
        }


        return answer;
    }

}


