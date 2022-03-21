package BOJ;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class boj11286_절댓값힙 {

	private static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if(Math.abs(a)> Math.abs(b))return 1;// 변경
				if(Math.abs(a)== Math.abs(b))return a-b;
				return -1;
				
			}
		});
		
		for(int i = 0 ;i<N; i++) {
			int now = sc.nextInt();
			if(now == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.add(now);
			}
		}
	}
}
