package 알고리즘다시듣기;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M_7 {
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
		permu(0);
		System.out.println(sb);

	}
	private static void permu(int cnt) {
		if(cnt == R) {
			for(int i =0; i<R; i++) {
				sb.append(ans[i] + " ");
			}
			//System.out.println();
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