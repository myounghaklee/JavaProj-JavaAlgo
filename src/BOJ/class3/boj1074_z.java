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
		divideNConquere(N, Y,X);
	
	}

	private static void divideNConquere(double range, int y, int x) {
		int half = (int)(range/2);
		if(y<half && x<half) {//2사분면 
			divideNConquere(half, y, x);
		}else if( y<half && x>=half) { // 1사분면 
			cnt +=()
		}
	}
}


/* 기본개념 
	 * 2차원 배열을 선언해서  brute force를 적용하면 메모리초과 남
	 * 따라서 divide * conquer를 적용해야함
	 * 1,2,3,4분으로 나눠서 정복해야한다. 
	 * 
	 */
/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        divide(N, c, r);
        System.out.println(count);
    }

    public static void divide(int n, int x, int y) {
        if (n == 0) {
            return;
        }

        int len = (int) Math.pow(2, n);
        int size = len * len;
        int partLen = len / 2;

        if (x < partLen && y < partLen) {
            divide(n - 1, x, y);
        } else if (partLen <= x && y < partLen) {
            count += (size / 4);
            divide(n - 1, x - partLen, y);
        } else if (x < partLen && partLen <= y) {
            count += (size / 4) * 2;
            divide(n - 1, x, y - partLen);
        } else if (partLen <= x && partLen <= y) {
            count += (size / 4) * 3;
            divide(n - 1, x - partLen, y - partLen);
        }
    }
}
*/