package T2.전화번호목록;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String [] phone_book= {"12","123","1235","567","88"};

        System.out.println(s.solution(phone_book));

    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String>map = new HashMap<>();
        for(int i = 0; i< phone_book.length; i++){
            map.put(phone_book[i],phone_book[i]);
        }

        for(String s : phone_book){
            for(int index = 0; index < s.length(); index++){
                String temp = s.substring(0, index);
                if( map.containsKey( temp ) ){
                    return false;
                }
            }
        }
        return answer;
    }
}
