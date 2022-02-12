package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj6064_카잉달력_solution2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int TC = Integer.parseInt(br.readLine());
		 
		while(TC-- > 0) {
			int cnt=0;
			//String s = br.readLine();
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int nx=X; int ny = 1;
			int max = M*N/gcd(M, N);
			int chk =0;
			for(int i=X ; i<max; i+=M) {
				if(i%N == Y) {
					System.out.println(i);
					chk = 1; 
					break;
				}
				
			}
			if(chk==0)System.out.println(-1);
			
			
		}
		
	}
	
	public static int gcd(int a, int b) {
		if(b==0) return a; 
		
		return gcd(b, a%b);
	}
		
}
