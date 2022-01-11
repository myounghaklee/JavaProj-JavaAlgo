package 하샤드;

public class Solution4 {
    public boolean solution(int x) {

        int s = sumDigits(x);
        boolean answer = false;
        if(x%s == 0 ) answer = true;
        else answer = false;
        return answer;
    }

    private int sumDigits(int x) {
        int sum = 0;
        while (x>0){
            sum +=x%10;
            x/=10;

        }
        return sum;
    }

}
