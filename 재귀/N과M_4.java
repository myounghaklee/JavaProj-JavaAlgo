package ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class N과M_4 {
	private static int N;
	private static int R;
	private static int[] arr;
	private static boolean[] isSelected;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int [R];
		isSelected = new boolean[N+1];
		combi(0,1);

	}

	private static void combi(int cnt, int start) {
		//기저조건
		if(cnt == R) {
			for(int i =0; i<R; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		//유도파트
		for(int i =start; i<=N ; i++) {
			arr[cnt] = i;
			combi(cnt+1,i);
			
		}
		
	}
}
