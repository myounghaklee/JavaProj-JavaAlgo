package 하샤드;

public class Solution2 {
    public boolean solution(int x) {

        int s = sumDigits(x);
        boolean answer = false;
        if(x%s == 0 ) answer = true;
        else answer = false;
        return answer;
    }

    private int sumDigits(int x) {
        String s = Integer.toString(x);
        int sum = 0;
        for (char ch: s.toCharArray()) {
            sum+=  Character.getNumericValue(ch);
        }
        return sum;
    }
}
