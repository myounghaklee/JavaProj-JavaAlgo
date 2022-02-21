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
			int X = Integer.parseInt(st.nextToken())-1;
			int Y = Integer.parseInt(st.nextToken())-1;
			int nx=X; int ny = 1;
			int max = M*N/gcd(M, N); //최소공배수 
			int chk =0;
			
			/*3
			10 12 3 9
			 (1,1)  (2,2) ..... (10,10) 
			 (1,11), (2,12), (3,1) 
			 * (3,Y) 
			 * 
			 * 
			 */
			for(int i=X ; i<max; i+=M) {
				if(i%N == Y) {
					System.out.println(i+1);
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
