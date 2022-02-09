package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3085_사탕게임 {
	private static char[][] board;
	private static int max = 0;
	private static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 N = Integer.parseInt(br.readLine());
		board = new char [N][N];
		for(int i = 0; i<N; i ++) {
			String tmp = br.readLine();
			for(int j =0; j<N ; j++) {
				board[i][j] = tmp.charAt(j);
			}
		}
		
		
		//System.out.println("안녕하세요");
		//가로 변경
		for(int i = 0; i<N; i ++) {

			for(int j =0; j<N-1 ; j++) {
				char tmp = board[i][j];
			    board[i][j] = board[i][j+1];
			    board[i][j+1] = tmp;
			    if(i==3 && j ==0) System.out.println("여기");
			    calculateGaro();
				calculateSero();

				tmp = board[i][j];
				board[i][j] = board[i][j+1];
				board[i][j+1] = tmp;
			}			
		}
		
		//세로변경
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				char temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1] [i]= temp;
				
				calculateGaro();
				calculateSero();
				temp = board[j][i];
				board[j][i] = board[j+1][i];
				board[j+1] [i]= temp;
			}
		}
		System.out.println(max);		
	}

	private static void calculateSero() {
		// TODO Auto-generated method stub
		for(int i =0 ;i<N ;i++) {
			int cnt = 1;
			for(int j =0;j<N-1;j++) {
				if(board[j][i]== board[j+1][i]) {
					++cnt;
				System.out.println(j + " "+ i+" : "+ cnt+ " " +board[j][i]);
				}
				else {
					cnt =1;
				}
				
				max = Math.max(max, cnt);
			}
		}
		
	}

	private static void calculateGaro() {
		for(int i = 0; i<N ;i++) {
			int cnt = 1;
			for(int j =0;j<N-1;j++) {
				if(board[i][j]== board[i][j+1]) {
					++cnt;
					System.out.println("가로 " +i + " "+ j+" : "+ cnt+ " " +board[i][j]);
				}

				else {
					cnt =1;
				}
				
				max = Math.max(max, cnt);
			}
		}
		
	}
}
