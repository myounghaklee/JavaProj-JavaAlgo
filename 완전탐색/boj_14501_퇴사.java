import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * KnapSack ������ �ѹ��� == N�̶�� �����ϸ� �ȴ�.  
 */

public class boj_14501_��� {
	private static int N;
	private static int[] w;
	private static int[] v;
	private static int[] dp;
	private static int ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine()); //���������� �� 
		w = new int[N+1];
		v = new int [N+1];
		dp = new int [N+1];
		
		for(int i =0; i<N ;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		//System.out.println(v[N]);
		ans = 0;
		dfs(0,0);
		
		System.out.println(ans);
	}

	private static void dfs(int idx, int a) {
		if(idx>=N) {
			
			ans = Math.max(ans, a);
			return;
		}
		
		if((idx+w[idx]) <=N ) {

			dfs(idx + w[idx], a+v[idx]);
		}
		else dfs(idx+ w[idx] , a);
		
		dfs(idx+1, a);
		
		
	}
}
