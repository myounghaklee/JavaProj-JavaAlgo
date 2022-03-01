package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class boj5430_ac {

	private static int T;
	private static int N;
	public static StringBuilder sb;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		T = Integer.parseInt(br.readLine());
		while (--T >= 0) {
			sb = new StringBuilder();
			String order = br.readLine();
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
			for (int i = 0; i < N; i++) {
				String tmp = st.nextToken();

				deque.add(Integer.parseInt(tmp));
			} // 배열 입력
			String direction = "obverse";
			int errChk = 0;

			for (char command : order.toCharArray()) {
				if (command == 'R' && direction == "obverse") {
					direction = "reverse";

					continue;
				}
				if (command == 'R' && direction == "reverse") {
					direction = "obverse";
					continue;
				}
				if (command == 'D') {
					if (direction == "obverse") {
						if (deque.peekFirst() == null) {
							// System.out.println("error");
							sb.append("error").append('\n');
							errChk = 1;
							continue;
						} else {
							deque.pollFirst();
						}
					} else {
						if (deque.peekLast() == null) {
							// System.out.println("error");
							sb.append("error").append('\n');
							errChk = 1;
							continue;
						} else {
							deque.pollLast();
						}
					}
				} // end if D
			} // end for Loop

			if (sb.length() == 0) {//error아닐때 

				sb.append('['); // 여는 대괄호 먼저 StringBuilder에 저장

				if (deque.size() > 0) { // 만약 출력 할 원소가 한 개 이상일 경우

					if (direction == "obverse") { // 정방향일경우

						sb.append(deque.pollFirst()); // 먼저 첫 번째 원소를 넘겨준다.

						// 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 하나씩 뽑아 넘긴다.
						while (!deque.isEmpty()) {
							sb.append(',').append(deque.pollFirst());
						}
					} else { // 역방향일경우
						sb.append(deque.pollLast()); // 먼저 뒤에서부터 첫 번째 원소를 넘겨준다.

						// 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 뒤에서부터 하나씩 뽑아 넘긴다.
						while (!deque.isEmpty()) {
							sb.append(',').append(deque.pollLast());
						}
					}
				}

				sb.append(']').append('\n'); // 닫는 대괄호 및 개행으로 마무리
			}
			System.out.print(sb);

		} // end testcase
	}

}

