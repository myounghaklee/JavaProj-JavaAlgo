package 알고리즘다시듣기;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 * 중복조합 문제 
 * 
 * ins 
 * 4 2
 * 9 8 7 1
 * 
 * outs
 * 1 1
1 7
1 8
1 9
7 7
7 8
7 9
8 8
8 9
9 9
 */

public class N과M_8 {
	private static int N;
	private static int R;
	private static int[] arr;
	private static boolean[] isSelected;
	private static int[] ans;
	private static StringBuilder sb;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		ans = new int[R];
		isSelected = new boolean[N+1];
		//permu(0);
		combi(0,0);
		System.out.println(sb);

	}
	private static void combi(int cnt, int start) {
		if(cnt ==R){
			for(int i =0; i<R; i++) {
				sb.append(ans[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i =start; i<N; i++) {
			ans[cnt ] = arr[i];
			combi(cnt+1,i);
		}
		
		
	}
	private static void permu(int cnt) {
		if(cnt == R) {
			for(int i =0; i<R; i++) {
				sb.append(ans[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i =0; i<N; i++) {
			//if(isSelected[i+1]) continue;
			ans[cnt] = arr[i];
			//isSelected[i+1] = true;
			permu(cnt+1);
			//isSelected[i+1] = false;
		}
		
		
	}

	
}