package goorm;

import java.util.Scanner;

public class 문제2b_오름차순인가 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * 주어진 배열이 오름차순인지 검사하는 함수
     * @param data
     * @param n     데이터의 수
     * @return      data[0] ~ data[n-1]이 오름차순이라면 true, else false
     */
	public static boolean isOrdered(int[] data, int n)
	{
		for(int i=0; i<n-1; i++) {
			if(data[i]>data[i+1])return false;
		}
		
		return true;
	}


	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		boolean result = isOrdered(data, n);

		if(result)
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
