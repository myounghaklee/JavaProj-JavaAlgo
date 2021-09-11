package 알고리즘다시듣기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14391_종이조각 {

	private static int M;
	private static int N;
	private static int max = Integer.MIN_VALUE;
	private static int[] dx = {1,0};
	private static int[] dy = {0,1};
	private static int[][] paper;
	private static boolean[][] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		paper = new int[N][M];
		visited = new boolean [N][M];
		visited[0][0] = true;
		for(int i = 0; i<N ;i++) {
			//st = new StringTokenizer(br.readLine());
			String s = br.readLine();
			for (int j = 0; j<M ; j++) {
				paper[i][j] =s.charAt(j)-'0';//Integer.parseInt(st.nextToken());
				
			}
		}
		bfs(0,0);
		System.out.println(max);
	}
	private static void bfs(int y, int x) {
		if(y>N-1) {
			sumFunc();
			return;
		}
		
		// 한행 체크 
		if(x>M-1) {
			bfs(y+1, 0);
			return;
		}
		
		//가로숫자로 사용
		visited[y][x] = true;
		bfs(y, x+1);
		
		//세로숫자로 사용
		visited[y][x] = false;
		bfs(y,x+1);
		
		
		
		
		
		
	}
	private static void sumFunc() {
		int ret = 0; 
		int tmp = 0;
		
		//가로계산 
		for(int i = 0 ;i<N ; i++) {
			tmp = 0; 
			
			for(int j = 0;j<M; j++) {
				if(visited[i][j] ) {
					tmp*=10;
					tmp  +=paper[i][j];
				}else {
					ret += tmp;
					tmp = 0;
				}
			}
			ret +=tmp;
		}
		
		//세로 계산
		for(int i = 0 ;i<M ; i++) {
			tmp = 0; 
			
			for(int j = 0;j<N; j++) {
				if(!visited[j][i] ) {
					tmp*=10;
					tmp  +=paper[j][i];
				}else {
					ret += tmp;
					tmp = 0;
				}
			}
			ret +=tmp;
		}
		max = Math.max(max, ret);
		
	}


	
}