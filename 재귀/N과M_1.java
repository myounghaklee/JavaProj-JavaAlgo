package ssafy;

import java.util.Arrays;
import java.util.Scanner;

public class N°úM_1 {
	private static int M;
	private static int N;
	private static int[] arr;
	private static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int [M];
		isSelected = new boolean[N+1];
		
		permu(0);
		
	}
	
	private static void permu(int cnt) {
		if(cnt == M) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i = 1; i<=N; i++) {
			if(isSelected[i])continue;
			
			arr[cnt] =i;
			isSelected[i] = true;
			permu(cnt+1);
			isSelected[i]= false;
		}
	}
}
