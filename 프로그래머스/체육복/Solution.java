package T3.체육복;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int lost[] = {4,3};
        int reserve[] = {3,2};
        System.out.println(s.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int ans= 0 ;
        int student [] = new int [n+1];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i =0 ;i<reserve.length; i++){
            student[reserve[i]] = 2;
            for(int j=0; j< lost.length; j++){ //여분을 챙겨온 학생이 분실당했을 경우
                if(reserve[i] == lost[j] ){
                    System.out.println(lost[j] + "aaaa ");
                    student[reserve[i]] = 0;
                }
            }
        }

        for(int i =0; i< lost.length; i++){
            //System.out.println("lost = : " +lost[i]);
            if(lost[i]!= (student.length-1) && (student[lost[i]+1]!=0 )  ){
                //System.out.println("in 첫번쨰 if");
                student[lost[i]+1] =0;
                lost[i] = 100;

                continue;

            }
            //System.out.println(lost[i]);
            //System.out.println(lost[i] + " " + student[lost[i]-1]);
            if((lost[i]!=1) && (student[lost[i]-1]!=0)){
                student[lost[i]-1]=0;
                lost[i] =  100;
                continue;
            }

        }
        for(int a : lost){
            if(a != 100) --n;
        }

        return n;
    }
}
