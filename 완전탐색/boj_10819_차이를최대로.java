package 알고리즘다시듣기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10819_차이를최대로 {
	private static int N;
	private static int[] input;
	private static int[] num;
	private static boolean[] isSelected;
	private static int max = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		input = new int[N];
		isSelected = new boolean[N];
		num = new int [N];
		for(int i =0 ;i<N ;i++){
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		findMaxSum(0);
		System.out.println(max);
				 
	}

	private static void findMaxSum(int cnt) {
		if(cnt ==N) {
			int sum=0;
			for(int i=0; i<N-1; i++) {
				sum+=Math.abs(num[i]-num[i+1]);
			}
			max = sum>max? sum: max;
			
			return;
		}
		for(int i =0; i<N; i++) {
			if(isSelected[i]) continue;
			isSelected[i] = true;
			num[cnt]= input[i];
			findMaxSum(cnt+1);
			isSelected[i] = false;
		}
		
	}
}

