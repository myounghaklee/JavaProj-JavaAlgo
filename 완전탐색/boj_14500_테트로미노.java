import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14500_��Ʈ�ι̳� {
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
	    		dfs(i,j,0,0); //��ǥ,4��count�� ����, ���� ���� ���� 
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
		int wing = 4; // ��������� �����¿� ����
		int min = Integer.MAX_VALUE;
		int sum = map[row][col];
		for (int i = 0; i < 4; i++) {
			int ny = row + dy[i];
			int nx = col + dx[i];

			// ������ 2���̻� ���ٸ� �� ����� �ƴϴ�. �׷��Ƿ� �Լ��� �����Ѵ�.
			if (wing <= 2)
				return;
			// ������ �� �ٱ��� �ִ� ���
			if (ny<0 || nx<0 || ny>=N || nx>=M) {
				wing--;
				continue;
			}
			min = Math.min(min, map[ny][nx]);
			sum = sum + map[ny][nx];
		}
		// ������ 4���϶� ���� ���� ������ ���־� ��,��,��,�� ����� ���´�.
		if (wing == 4) {
			sum = sum - min;
		}
		max = Math.max(max, sum);
	}
}
