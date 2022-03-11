package goorm;
import java.io.*;
import java.lang.*;
import java.util.*;
public class 문제1j_합구하기3 {
	public static final Scanner scanner = new Scanner(System.in);
	private static Long memo[];
	/**
	 * 1부터 M까지의 자연수의 합을 계산하는 함수
	 * @param M
	 * @return
	 */
	public static int getRangeSumFromOne(int M) {
		int tmp =0;
		for(int i = 1 ;i<=M ;i++) {
			tmp +=i;
		}
		return tmp;
	}

	/**
	 * N에 대한 정답을 계산하는 함수
	 * @param N
	 * @return
	 */
	public static Long getAnswer(int N)
	{ 
		Long ans=(long) 0; 
		memo[1]=(long)1; 
		for(int i = 2; i<=N ;i++) {
			
			memo[i] = memo[i-1] + i;

		}
		for(int i=1; i<=N; i++) {
			ans+=memo[i];
		}
		
		return ans;

	}


	public static void main(String[] args) throws Exception {
		
		int n = scanner.nextInt();
		memo = new Long[n+1];
		long answer = getAnswer(n);
		System.out.println(answer);
	}

}
