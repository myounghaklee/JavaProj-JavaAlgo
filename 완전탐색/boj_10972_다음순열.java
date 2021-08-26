package 알고리즘다시듣기;

import java.util.Scanner;

public class boj_10972_다음순열 {
	private static int[] input;
	private static String tmp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		input = new int[N];
		
		for(int i = 0; i<N ; i++) {
			input[i] = sc.nextInt();
		}
		tmp = input.toString();
		nextPermu(0);
		
	}

	private static void nextPermu(int i) {
		
		
	}
}
