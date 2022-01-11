package 1week.하샤드;

public class Solution3 {
    public boolean solution(int x) {

        int s = sumDigits(x);
        boolean answer = false;
        if(x%s == 0 ) answer = true;
        else answer = false;
        return answer;
    }

    private int sumDigits(int x) {
//        String s = Integer.toString(x);
//        int sum=0;
//        sum = s.chars().map(ch -> Character.getNumericValue(ch)).sum();
//
//        return sum;

        return Integer.toString(x).chars().map(Character::getNumericValue).sum();
    }

}
