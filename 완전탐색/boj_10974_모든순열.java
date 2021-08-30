package 알고리즘다시듣기;

import java.util.Scanner;

public class boj_10974_모든순열 {
	private static int N;
	private static int[] rsult;
	private static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		rsult = new int[N];
		isSelected = new boolean[N];
		permu(0);
	}

	private static void permu(int idx) {
		if(idx ==N) {
			for(int i=0; i<N ;i++) {
				System.out.print(rsult[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(isSelected[i])continue;
			rsult [idx] =i+1;
			isSelected[i] = true;
			permu(idx+1);
			isSelected[i] = false;
			
		}
		
	}
}
