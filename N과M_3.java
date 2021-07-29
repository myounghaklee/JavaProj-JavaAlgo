//package 알고리즘다시듣기;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;



public class N과M_3 {
	private static int N, R;
	private static int[] arr;
	
	public static void main(String[] args) throws Exception{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int [R];
		
		permu(0);
		
	}
	
	private static void permu(int cnt) {
		if(cnt == R) {
			for(int i =0; i<R; i++) {
				System.out.print(arr[i] + " ");
				
			//System.out.println(Arrays.toString(arr));
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i<=N; i++) {
			//if(isSelected[i])continue;
			
			arr[cnt] =i;
			//isSelected[i] = true;
			permu(cnt+1);
			//isSelected[i]= false;
		}
	}
}

