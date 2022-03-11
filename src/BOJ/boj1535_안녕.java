package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *DP 문제 
 *
 */
public class boj1535_안녕 {
	private static int N;
	private static int[] losePower;
	private static int[] happy;
	int max = 0;

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		losePower = new int[N];
		happy= new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ;i++) {			
			losePower[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ;i++) {
			happy[i] = Integer.parseInt(st.nextToken());
			
		}
		int memo[] = new int[100];
		for(int i=0; i<N; i++) {
			for(int j= 0; j<100; j++) {
				int now = losePower[i] +j;
				if(now<100)
					/* 여기 못풀겠음..*/
					memo[now] = Math.max(memo[now], memo[99-j]+happy[i]);
				System.out.println(j + " "+now + " " + memo[now]);
			}
		}
		System.out.println(memo[99]);
		String a; 
		a.
	}
	
	
}
