package BOJ.class3;

import java.util.Scanner;

public class boj1074_z {
	private static int N;
	private static int Y;
	private static int X;
	private static double leng;
	private static int[][] map;
	private static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Y = sc.nextInt();
		X = sc.nextInt();
		
		leng = Math.pow(2, N);
		map = new int[(int) leng][(int) leng];
		cnt = 0;
		divideNConquere(leng, Y,X);
	
	}

	private static void divideNConquere(double range, int y, int x) {
		int half = (int)(range/2);
		if(y<half && x<half) {
			divideNConquere(half, y, x);
		}else if()
	}
}
