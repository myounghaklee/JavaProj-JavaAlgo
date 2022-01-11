package T1.문자열내마음대로정렬하기;

import org.jetbrains.annotations.NotNull;

import java.sql.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String [] string = {"sun", "bed", "car"};
        int n = 1;
        String answer[] = solution(string, n);
    }

    static class cc implements Comparable<cc>{
        String s;
        char at;    //n번째 글자
        int idx;    //몇번째 string인지

        @Override
        public int compareTo( Solution.cc o) {
            if(this.at >o.at)return 1;
            else if(this.at <o.at) return -1;
            else{
                return this.s.compareTo(o.s);
            }

        }

//        public cc(char at, int idx) {
//            this.at = at;
//            this.idx = idx;
//        }
    }
    public static String[] solution(String[] strings, int n) {
        cc arry [] = new cc [strings.length];
        String[] answer = new String[strings.length];

        for(int i=0; i< strings.length; i++ ){
            System.out.println(strings[i].charAt(n));
            cc ctmp = new cc();
            ctmp.s = strings[i];
            ctmp.at = strings[i].charAt(n);
            ctmp.idx = i;
            arry[i] = ctmp;
        }
        Arrays.sort(arry);
        System.out.println(arry[0].at + " " +arry[1].at);
        for (int i =0 ;i< strings.length; i++){
            answer[i] = strings[arry[i].idx];
            System.out.println(answer[i]);
        }


        return answer;
    }
}
