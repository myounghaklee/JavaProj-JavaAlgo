package goorm;

import java.util.Scanner;

public class 문제2a_도토리키재기 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] height = new int[n];
		int[] month = new int[n];

		for(int i = 0 ; i < n ; i ++)
		{
			height[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			month[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();

		int answer = getMaximumHeight(height, month, n, m);

		System.out.println(answer);
	}

	private static int getMaximumHeight(int[] height, int[] month, int n, int m) {
		int now = -1;
		for(int i = 0; i<height.length; i++) {
			if(month[i] == m) {
				now = now<height[i] ? height[i]: now;
			}
		}
		return now
				;
	}

}
