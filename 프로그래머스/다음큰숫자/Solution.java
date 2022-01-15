package T2.다음큰숫자;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(78);
        System.out.println(answer);
    }

    public int solution(int n ){
        //host code
        int ans = 0;
        int bits = bitCount(n);
//        for(int i =n+1; i<1000000; i++){
//            if(bitCount(i) == bits){
//                ans = i;
//                break;
//            }
//        }
        //위의 주석과 같은 코드
        while(bitCount(++n) != bits);
            return n;

        //return ans;
    }

    private int bitCount(int n ){
        //TODO: 2진수
        return Integer.bitCount(n);
    }
}
