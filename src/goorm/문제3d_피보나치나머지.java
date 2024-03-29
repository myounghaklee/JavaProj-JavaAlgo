package goorm;

import java.io.*;
import java.lang.*;
import java.util.*;


public class 문제3d_피보나치나머지 {
	public static final Scanner scanner = new Scanner(System.in);
	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static final int MAX_N = 100000000 + 1;
	public static int[] FIBONACCI_TABLE;

	/**
	 * 피보나치 수열의 1~n번째 항을 배열에 저장하여 반환해주는 함수
	 * * 단, 항의 가장 뒤 8자리만을 저장한다.
	 * @param n
	 * @return fibo[i] := 피보나치 수열의 i번째 항
	 */
	public static int[] makeFibonacciTable(int n){
	
		int tmpFibop[] = new int[MAX_N+1];
		tmpFibop[0] = 0;
		tmpFibop[1] = 1;
		tmpFibop[2] = 1;
		
		for(int i = 3; i<=n; i++) {
			tmpFibop[i] = tmpFibop[i-1] + tmpFibop[i-2]; 
		}
		return tmpFibop;
	}

	/**
	 * 피보나치 수열의 n번째 항을 반환하는 함수
	 * 단, 항의 가장 뒤 8자리만을 반환한다.
	 * @param n
	 * @return
	 */
	public static int getFibo(int n)
	{
		int answer = FIBONACCI_TABLE[n]%100000000;

		return answer;
	}

	public static void main(String[] args) throws Exception {

		//가능한 모든 범위에 대한 피보나치 수열의 값을 계산해두자
		FIBONACCI_TABLE = makeFibonacciTable(MAX_N);

		//테스트케이스를 반복 수행한다.
		int caseSize = scanner.nextInt();
		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
		{
			int n = scanner.nextInt();

			//피보나치 수열의 n번째 항을 계산하여 출력한다.
			int answer = getFibo(n);
			writer.write(String.valueOf(answer) + "\n");
		}

		//불필요한 배열은 가능하면 할당 해제해주는 버릇을 들이자.
		FIBONACCI_TABLE = null;

		writer.flush();
		writer.close();
	}

}
