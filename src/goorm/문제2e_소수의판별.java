package goorm;
import java.io.*;
import java.lang.*;
import java.util.*;

public class 문제2e_소수의판별 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
    * 주어진 숫자가 소수인지 판별하는 함수 
    *
    * @param N 
    * @return true   소수라면 
    * @return false  소수가 아니라면
    */
	public static boolean isPrime(int N)
	{
		int num[] = new int [N+1];
//		for(int i=2; i<=N; i++) {
//			if(num[i]==0)continue;
//			
//			for(int j=2*i ; j<=N ; j+=i) {
//				num[j] = 0;
//			}
//		}
//		if(num[N]==0) return false;
//		
//		else return true;
		int cnt=0;
		if(N==1) return false;
		if(N==2) return true;
		if(N%2 == 0)return false;
		for(int i =2; i<Math.sqrt(N); i++) {
			if(N%i==0) {
				cnt++;
				break;
			}
		}
		return cnt==0;
				
	}

	public static void testCase(int caseIndex)
	{
		int n = scanner.nextInt();
		boolean result = isPrime(n);

		System.out.printf("Case #%d\n", caseIndex);
		if(result)
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}
