package T2.전화번호목록;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String [] phone_book= {"119", "97674223", "1195524421"};//{"12","123","1235","567","88"};
        boolean ans = s.solution(phone_book);
        System.out.println(ans);

    }
    public boolean solution(String[] phone_book) {

        boolean answer = true;
        HashMap<String, String>map = new HashMap<>();
        for(int i = 0; i< phone_book.length; i++){
            map.put(phone_book[i],phone_book[i]);
        }

        /*
        역으로 119가 1195524421안에 들어있는지 탐색하는게 아니라
        1195524421의 subString인 119가 phone_book에 있는지 확인하는 방법
         */
        for(String s : phone_book){
            for(int index = 0; index < s.length(); index++){
                String temp = s.substring(0, index);

                System.out.println("tmep : " +temp);

                if( map.containsKey( temp ) ){
                    System.out.println("if in  : " + temp);
                    return false;
                }
            }
        }
        return answer;
    }
}
