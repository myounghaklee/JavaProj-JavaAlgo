package T2.다음큰숫자;

public class Solution4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(78);
        if(answer != 83) throw new RuntimeException("정답이아니야");
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
        //시간초과뜸
        //숫자->string으로 변경하는 오버헤드 발생
        String bin = Integer.toBinaryString(n);
        return (int)Integer.toBinaryString(n)
                .chars()
                .filter(ch-> ch=='1')
                .count();
    }
}


