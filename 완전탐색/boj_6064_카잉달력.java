package 알고리즘다시듣기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_6064_카잉달력 {
	private static int N;
	private static int x;
	private static int y;
	private static int n;
	private static int m;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			m= Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			int flag =0;
			//System.out.println("ㅇ거느 : ?"+gcd(m,n));
			int totalCnt = (n*m)/gcd(m,n);
			int ans =-1;
			//System.out.println("최소공배수 : "+totalCnt);
			
			for(int j=x-1; j<totalCnt; j+=m) {
				if(j%n == y-1) {
					System.out.println(j+1);
					flag =1;
					break;
				}
			}
			if(flag ==0)System.out.println(ans);
		}
		
	}

	private static int gcd(int a, int b) {
		
		while(b !=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
