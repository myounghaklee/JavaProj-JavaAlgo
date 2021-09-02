import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class boj_10971_외판원순회2 {
	private static int N;
	private static boolean[] visited;
	private static int[][] map;
	private static int[] permuRsult;
	private static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		visited = new boolean[N];
		map = new int[N][N];
		permuRsult = new int[N];
		/*
		 * for(int i =0; i<N ;i++) { permuRsult[i] = i; }
		 */
		for(int i = 0 ;i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j<N ; j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		permu(0);
		System.out.println(min);
	}
	private static void permu(int cnt) {
		
		//기저조건
		if(cnt ==N ) {
			int sum = 0;
			/*
			 * for(int i =0; i<N-1 ;i++) { sum += map[permuRsult[i]][permuRsult[i+1]]; }
			 */
			for(int i =0; i<N ;i++) {
				//sum += map[permuRsult[i]][permuRsult[i+1]];
				System.out.print(permuRsult[i] + " ");
			}
			for(int i =0; i<N-1 ;i++) {
				sum += map[permuRsult[i]][permuRsult[i+1]]; 
				if(i==2) sum +=map[permuRsult[i]][permuRsult[0]];
			}
			System.out.print(" " + sum);
			System.out.println();
			min= min<sum? min : sum;
		}
		
		for(int i =0 ;i<N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			permuRsult[cnt] = i;
			permu(cnt+1);
			visited[i] = false;
		}
		
	}
}
