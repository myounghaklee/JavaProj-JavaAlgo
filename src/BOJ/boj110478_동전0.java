package BOJ;

import java.util.Scanner;

public class boj110478_동전0 {

	private static int N;
	private static int K;
	private static int[] coin;
	private static int[] value;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		coin = new int [N];
		for(int i=0 ;i<N ; i++) {
			coin[i] = sc.nextInt();
		}
		int cnt = 0;
		for(int i = N-1; i>=0 ;i++) {
			if(coin[i]<=K) {
				cnt+=(K/coin[i]);
				K = K%coin[i];
			}
		}
		System.out.println(cnt);
	
	}
}
