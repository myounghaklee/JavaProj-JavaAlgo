package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10157자리배정 {

	private static int x;
	private static int y;
	private static int N;
	private static int[][] map;
	private static int cnt;
	private static int ny;
	private static int nx;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		
		N = Integer.parseInt(br.readLine());
		
		map = new int [y][x];
		
		ny= y-1;
		nx = 0;
		cnt = 1;
		while(true) {
			if(map[ny-1][x]==0)
		}

	}

}
