package ssafy;

import java.util.Arrays;
import java.util.Scanner;

public class N°úM_2 {
	static int [] numbers;
	static int N,R;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		numbers = new int [R];
		combi(0,1);

	}
	
	static void combi(int cnt, int start) {
		if(cnt==R) {
			for(int i =0; i<R; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i =start; i<=N; i++) {
			numbers[cnt] = i;
			combi(cnt+1, i+1);
		}
	}
}
