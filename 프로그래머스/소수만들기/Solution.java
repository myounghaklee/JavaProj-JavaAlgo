package T1.소수만들기;

import java.util.Arrays;

public class Solution {

    private static int ansArry[];
    private static int answer;
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        solution(nums);

    }

    public static  int solution(int[] nums) {

        Arrays.sort(nums);
        ansArry = new int [3];
        combi(nums, 0,0);
        System.out.println(answer);
        return answer;
    }

    static void combi(int []nums, int cnt, int start) {
        if(cnt==3) {
            //System.out.println("====" +ansArry[0] + " " + ansArry[1] + " "+ ansArry[2]);
            int sum = 0;
            for(int i =0; i<3; i++) {
                sum += ansArry[i];
            }
            for(int i =2; i<=Math.sqrt(sum); i++){
                if(sum%i ==0) return;
            }
            answer ++;

            return;
        }
        for(int i =start; i<nums.length; i++) {
            //System.out.println(cnt + " " + nums[i]);

            ansArry[cnt] = nums[i];

            combi(nums,cnt+1, i+1);
        }
    }

}
