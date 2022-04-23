package TopCoder.전체탐색;

public class 암호 {

	/*
	 * +1하는 숫자를 하나 정한다. 
	 * 모든 곱을 계산하고 최댓값을 찾는다.
	 * 
	 * ********응용 버전**********
	 * 정렬을 이용해 가장 작은 수를 찾아 그 수를 +1한것이  
	 */
	public static void main(String[] args) {
		int numbers[] = {1,2,3};
		long answer = encrypt1(numbers);
		System.out.println(answer);

	}

	private static long encrypt1(int[] numbers) {
		long ans =0;
		for(int i = 0 ;i<numbers.length; i++) {
			long tmp =1;
			for(int j =0; j<numbers.length; j++) {
				if(i==j) {
					tmp*=(numbers[j]+1);
				}else {
					tmp*=(numbers[j]);
				}
			}
			ans = Math.max(ans, tmp);
		}
		return ans;
	}

}
