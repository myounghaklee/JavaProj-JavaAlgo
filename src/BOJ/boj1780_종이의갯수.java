package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1780_종이의갯수 {
	/* DivideNConquere 라는 느낌이 강했던 문
	 * 
	 *
	 */
	private static int N;
	private static int[][] paper;
	private static int minusChk, zeroChk, plusCheck;
	private static int []ans = new int[3]; // -1 => 0, 0=>1, 1=>2 
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		paper= new int[N][N];
		for(int i = 0 ; i<N ;i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0 ;j<N ;j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력 end
		
	   dNv(0,0, N);
	   for(int i = 0 ;i<3; i++) {
		   System.out.println(ans[i]);
	   }

	}

	private static void dNv(int y, int x, int n) {
		if(allCheck(y,x,n)) {
			ans[paper[y][x]+1]++;
			
		}
		else {
			//int tmp = paper[y][x]; 
			for(int i = 0 ; i<3; i++) {
				for(int j = 0 ; j<3; j++) {
					dNv(y+ i*(n/3), x+ j*(n/3), n/3);
				}
			}
		}	
		
	}

	private static boolean allCheck(int y, int x, int n) {
		//System.out.println("allcheck + : "+ y + " " + x + " " + paper[y][x]);
		int tmp = paper[y][x];
		
		for( int i = y; i<y+n ; i++) {
			for(int j = x; j<x+n; j++) {
				if(tmp!=paper[i][j]) return false;
			}
		}
		return true;		
	}

}
