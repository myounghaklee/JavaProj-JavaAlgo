package T2.전화번호목록;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        String [] phone_book= {"12","123","1235","567","88"};

        System.out.println(s.solution(phone_book));

    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i =0; i< phone_book.length-1; i++){
            String s = phone_book[i];
                for (int j = i + 1; j < phone_book.length; j++){
                    if(phone_book[j].startsWith(s)) return false;
                    if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        return answer;
    }
}