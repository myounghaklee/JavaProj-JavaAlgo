package 방문길이;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;

//public static boolean map [5][5] ;
class Solution {
    //LULLLLLLU
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        int a = solution(dirs);
        System.out.println(a);

    }
    static int solution(String dirs) {
        int answer = 0;
        HashSet<String> s = new HashSet<String>();  //중복확인 위해 사용하는 set
        char order[] = dirs.toCharArray();
        int len = dirs.length();

        int nowX = 0;
        int nowY = 0;

        for(int i=0; i<len; i++){
            int nextX = nowX;
            int nextY = nowY;
            String road = "";       //경로 저장할 문자열

            switch(order[i]){
                case 'U' :
                    nextY++;
                    road += nowX;
                    road += nowY;
                    road += nextX;
                    road += nextY;
                    break;
                case 'D' :
                    nextY--;
                    road += nextX;
                    road += nextY;
                    road += nowX;
                    road += nowY;
                    break;
                case 'R' :
                    nextX++;
                    road += nowX;
                    road += nowY;
                    road += nextX;
                    road += nextY;
                    break;
                case 'L' :
                    nextX--;
                    road += nextX;
                    road += nextY;
                    road += nowX;
                    road += nowY;
                    break;
                default: break;
            }

            //범위 벗어나면 무시
            if(nextX < -5 || nextY < -5 || nextX > 5 || nextY > 5)
                continue;

            s.add(road);
            nowX = nextX;
            nowY = nextY;
        }
        answer = s.size();
        return answer;
    }
}