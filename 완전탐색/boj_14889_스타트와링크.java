import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 
 * 완전탐색 조합으로 모든 경우의수를 탐색해서 풀면 되지 않을까? 라는생각...
 */
public class boj_14889_스타트와링크 {
	private static int N;
	private static int[][] team;
	private static int min;
	static int num[];
	static boolean [] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		team = new int [N][N];
		num = new int[N/2];
		visited = new boolean[N];
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j =0; j<N ;j++) {
				team[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력부
		min = Integer.MAX_VALUE;
		combi(0, 0);
		System.out.println(min);
	}
	private static void combi(int cnt, int start) {
		if(cnt == N/2) {
			min = Math.min(min, getDiff());
			for(int i=0; i<cnt; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.print(" "+min);
			System.out.println();
		 return;	
		}
		for(int i = start; i<N; i++) {
			if(visited[i])continue;
			num[cnt] = i;
			visited[i] = true;
			combi(cnt+1,i+1);
			visited[i] = false;
		}

	
	}
	//스타트팀과 링크팀의 차를 구할때 combi에서 사용한 visited를 이용해 
	//팀을 구별하는것이 관건!!
	private static int getDiff() { 
	  int startSum = 0; 
	  int linkSum = 0; 
	  for(int i=0; i<N; i++) { 
		  for(int j = 0; j<N; j++) { 
			  if(visited[i] && visited[j]) {
				  //System.out.println(i + " 번쨰, "+j+" 번쨰값은 : " + team[i][j]);
				  startSum +=team[i][j];
			  }
			  else if(!visited[i] && !visited[j]) {
				  linkSum +=team[i][j];
			  }
		  }
		  }
	  
	  return Math.abs(startSum- linkSum); 
	  
	}
	 	
	/*
	 if(cnt == R) {
			for(int i =0; i<R; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		//유도파트
		for(int i =start; i<N ; i++) {
			if(isSelected[i+1]) continue;
			
			arr[cnt] = input[i];
			isSelected[i+1] = true;
			combi(cnt+1,i);
			isSelected[i+1] = false;
			
		}
	 */
}
