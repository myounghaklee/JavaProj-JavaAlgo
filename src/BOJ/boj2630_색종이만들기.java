package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2630_색종이만들기 {
	private static int N;
	private static int[][] paper;
	private static int[] allCnt = new int [2];

	public static void main(String[] args) throws Exception{
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
		dNv(0,0,N);
		for(int i = 0 ;i<2; i++) {
			   System.out.println(allCnt[i]);
		   }

	}
	
	private static void dNv(int y, int x, int n) {
		if(allCheck(y,x,n)) {
			allCnt[paper[y][x]]++;
			
		}
		else {
			//int tmp = paper[y][x]; 
			for(int i = 0 ; i<2; i++) {
				for(int j = 0 ; j<2; j++) {
					dNv(y+ i*(n/2), x+ j*(n/2), n/2);
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
