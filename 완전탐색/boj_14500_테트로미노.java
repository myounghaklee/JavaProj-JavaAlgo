import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14500_테트로미노 {
	private static int N;
	private static int M;
	private static int[][] map;
	private static int[] dy = {-1,1,0,0};
	private static int[] dx = {0,0,-1,1};
	private static int max;
	private static boolean[][] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	    map = new int[N][M];
	    visited = new boolean[N][M];
	     max = 0;
	    for(int i=0; i<N ; i++) {
	    	st = new StringTokenizer(br.readLine(), " ");
	    	for(int j= 0 ;j<M; j++) {
	    		map[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    
	    for(int i =0; i<N; i++) {
	    	for(int j=0; j<M; j++) {
	    		dfs(i,j,0,0); //좌표,4번count할 변수, 값을 더할 변수 
	    		exception(i,j);
	    	}
	    }
	    System.out.println(max);
	}
	private static void dfs(int y, int x, int cnt, int value) {
		if(cnt ==4) {
			max = Math.max(max, value);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int ny = y+dy[i];
			int nx = x+dx[i];
			if(ny<0 || nx<0 || ny>=N || nx>=M || visited[ny][nx]) continue;
			visited[ny][nx] = true;
			dfs(ny,nx,cnt+1, value+map[ny][nx]);
			visited[ny][nx] = false;			
		}
		
	}
	private static void exception(int row, int col) {
		int wing = 4; // 가운데에서의 상하좌우 날개
		int min = Integer.MAX_VALUE;
		int sum = map[row][col];
		for (int i = 0; i < 4; i++) {
			int ny = row + dy[i];
			int nx = col + dx[i];

			// 날개가 2개이상 없다면 ㅗ 모양이 아니다. 그러므로 함수를 종료한다.
			if (wing <= 2)
				return;
			// 날개가 맵 바깥에 있는 경우
			if (ny<0 || nx<0 || ny>=N || nx>=M) {
				wing--;
				continue;
			}
			min = Math.min(min, map[ny][nx]);
			sum = sum + map[ny][nx];
		}
		// 날개가 4개일때 가장 작은 날개를 없애야 ㅗ,ㅏ,ㅓ,ㅜ 모양이 나온다.
		if (wing == 4) {
			sum = sum - min;
		}
		max = Math.max(max, sum);
	}
}
