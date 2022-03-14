package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1012_유기농배추 {
	private static int T;
	private static int xLeng;
	private static int yLeng;
	private static int bug;
	private static int land [][];
	private static int dx[] = {-1,1,0,0};
	private static int dy[] = {0,0,-1,1};
	private static boolean visited[][];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			xLeng = Integer.parseInt(st.nextToken());
			yLeng = Integer.parseInt(st.nextToken());
			bug = Integer.parseInt(st.nextToken());
			land = new int[yLeng][xLeng];
			visited = new boolean[yLeng][xLeng];
			for(int j=0; j<bug; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
			    int y = Integer.parseInt(st.nextToken());
				land[y][x]=1;
			}
			
			for(int i=0; i<yLeng; i ++) {
				for(int j =0; j<xLeng; j++) {
					if(land[i][j] ==1 && !visited[i][j]) {
						dfs(i,j);
						cnt ++;
					}
				}
			}
			System.out.println(cnt);
		}//end testcase for loop
	}
	private static void dfs(int y, int x) {
		visited[y][x] = true;
		
		for(int i = 0; i<4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i] ;
			
			if(ny>=0 && nx>=0 && ny<yLeng && nx<xLeng) {
				if(!visited[ny][nx] && land[ny][nx]==1) {
					dfs(ny, nx);
				}
			}
		}
		
	}

}
