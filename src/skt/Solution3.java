package skt;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
	private int dx[] = { 0, 1 };
	private int dy[] = { -1, 0 };
	private static boolean visited[][];
	private static int ans = 1;
	private Queue<Node> q = new LinkedList<Node>();

	public static void main(String[] args) {

		Solution3 s = new Solution3();
		int dia[][] = { { 1, 1 }, { 2, 2 } };
		visited = new boolean[3][3];
		int ans = s.solution(2, 2, dia);
		System.out.println(ans);
	}

	public int solution(int width, int height, int[][] diagonals) {

		int answer = 0;
		Node n = new Node(height-1, 0);

		q.add(n);
		bfs(width, height, diagonals, height - 1, 0);
		return (ans % 10000019);
	}

	private void bfs(int width, int height, int[][] diagonals, int y, int x) {
		if (y == 0 && x == width ) {
			// if(visited[dia])
			ans++;
			System.out.println(ans);
		}

		while (!q.isEmpty()) {
			Node node = q.poll();
			for (int i = 0; i < 2; i++) {
				int ny = node.y + dy[i];
				int nx = node.x + dx[i];

				if (ny >= 0 && nx > 0 && ny <= height && nx <= width) {
					if (!visited[ny][nx]) {
						q.add(new Node(ny,nx));
						System.out.println(ny + " " + nx );
						visited[ny][nx] = true;
						bfs(width, height, diagonals, ny, nx);
						visited[ny][nx] = false;
					}
				}
			}
		}

	}

	static class Node {
		public Node(int ny, int nx) {
			this.y = ny;
			this.x = nx;
		}
		int y;
		int x;
	}

}
