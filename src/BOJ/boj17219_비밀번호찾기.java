package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj17219_비밀번호찾기 {
	private static int M;
	private static int N;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken()); //사이트 주소 갯수  
		M = Integer.parseInt(st.nextToken()); //찾으려는 비번 갯수
		
		HashMap <String, String > map = new HashMap<>();
		for(int i = 0 ;i<N ;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
			
		}
		for(int i = 0; i<M; i++) {
			sb.append(map.get(br.readLine())).append('\n');
		}
		System.out.print(sb.toString());
	}
}
