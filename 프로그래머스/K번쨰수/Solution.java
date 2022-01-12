package T1.K번쨰수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int array[] ={1, 5, 2, 6, 3, 7, 4};
        int commands[][] ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int answer [] = solution(array, commands);
        for(int i  =0; i<3; i++) {
            System.out.print(answer[i] + " ");
        }

    }

    public static int[] solution(int[] array, int[][] commands) {


        int leng = commands.length;
        int[] answer = new int [leng];
        //System.out.println(leng);
        for(int i = 0 ; i<leng; i++){
            ArrayList list = new ArrayList();
            int start = commands[i][0] -1;
            int end = commands[i][1] ;
            for (int j = start; j<end; j++){
                //System.out.println(i + " " + j + " value = " + array[j]);
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = (int) list.get(commands[i][2]-1);

        }

        return answer;
    }
}
