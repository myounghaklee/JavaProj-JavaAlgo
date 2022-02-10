package BOJ;

import java.util.Scanner;

public class boj1748_수이어쓰기1 {

	private static int N;
	private static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		cnt = 0;
		if(N<10) {
			cnt=N;
		}
		if(10<= N && N <100) {
			cnt = 9 + (N-9)*2;
		}
		if(100<= N && N<1000) {
			cnt = 9 + 90*2 + (N-99)*3;
		}
		if(1000<=N && N<10000) {
			cnt = 9 + 90*2 + 900*3 + (N-999)*4;
		}
		if(10000<=N && N<100000) {
			cnt = 9 + 90*2 + 900*3 + 9000*4 + (N-9999)*5;
		}
		if(100000<=N && N<1000000) {
			cnt = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + (N-99999)*6;
		}
		if(1000000<=N && N<10000000) {
			cnt = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + (N-999999)*7;
		}
		if(10000000<=N && N<100000000) {
			cnt = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7+ (N-9999999)*8;
		}
		if(100000000<=N && N<1000000000) {
			cnt = 9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7 + 90000000*8 + (N-99999999)*9;
		}
		System.out.println(cnt);

	}

}
