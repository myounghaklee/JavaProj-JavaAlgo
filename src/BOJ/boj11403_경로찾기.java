package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11403_경로찾기 {
	private static int N;
	private static int[][] map;
	private static int[][] ans;
	private static boolean[][] isVisited;

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		N = Integer.parseInt(br.readLine());
		map= new int[N][N];
		ans= new int [N][N];
		isVisited = new boolean[N][N];
		for(int i = 0 ;i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] ==1)ans[i][j] =1;
			}
		}
		//dfs(0,0);
		for(int i = 0; i<N ;i++) {
			for(int j = 0; j<N ;j++) {
				
				//if(map[i][j]==1)ans[i][j] = 1;
				
				for(int k =0; k<N ;k++) {
					if(map[j][i]==1 && map[i][k]==1)
						ans[j][k] = 1;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}

	private static void dfs(int y, int x) {
		if(isVisited[y][x])return;
		
		
		
	}
}
