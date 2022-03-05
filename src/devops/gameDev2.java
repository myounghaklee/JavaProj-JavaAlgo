package devops;

import java.util.LinkedList;
import java.util.Queue;

public class gameDev2 {
	private static int dx[]= {1,1,1,0};
	private static int dy[] = {0,1,-1,-1};
	private static int visited[];
	private static int ans; 
	private Queue<Point> q = new LinkedList<>();
	public static void main(String[] args) {
		gameDev2 obj = new gameDev2();
		
		String board []= {"111100000","000010011","111100011","111110011","111100011","111100010","111100000"};
		int a = obj.solution(7, 9, 4, board);
		System.out.println(a);
		
	}
	
	
	    public int solution(int h, int w, int n, String[] board) {
	    	
	        int answer = -1;
	        char omok[][] = new char[h][w];
	        
	        for(int i = 0; i<h; i++) {
	        	for( int j = 0; j<w; j++){
	        		//omok[i][j] = board[i].charAt(j);
	        		//System.out.println(board[i].charAt(j));
	        		if(board[i].charAt(j)=='1') {
	        			q.offer(new Point('1',i,j,0));
	        			go(i,j,h,w,n,board,0);
	        		}
	        	}
	        }
	        
	        
	        
	        return ans;
	    }


		private void go(int y, int x,int h , int w, int n, String[] board,int now) {
			
			if(now ==n)return;
			//while(!q.isEmpty()) {
				
	        //	Point p = q.poll();
				Point p =null;
				if(!q.isEmpty())p= q.poll();
				if(p.ans==n) {
					
					 ++ans;
					 return;
				}
	       	
	        	for(int k=0; k<4; k++) {
    				int ny = p.y+dy[k];
    				int nx = p.x+dx[k];
    				if(ny>=0 && nx>=0 && ny<h && nx <w) {
    					if(board[ny].charAt(nx)=='1') {
    						//q.add(new Point('1',ny,nx,++p.ans));
    						//go(ny,nx,h,w,n, board, p.ans);
    						findFive(ny,nx,h,w,n, board);
    					}
    				}
    			}
	        //}
		}
		
		
		private static String findFive(int y , int x, int h, int w, int n , String board[]) {
			for (int j = 1; j <= 19; j++) {
				for (int i = 1; i <= 19; i++) {
					if (board[i].charAt(j) != '0') {
						for (int d = 0; d < 4; d++) {
						if (board[i][j][d] == 0 && calc(i, j, d, board[i][j]) == 5) {
								return board[i].charAt(j) + "\n" + i + " " + j + "\n";
							}
						}
					}
				}
			}
			return "0";
		}

		private static int calc(int x, int y, int dir, int color) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (map[nx][ny] == color) {
				return memo[nx][ny][dir] = calc(nx, ny, dir, color) + 1;
			}
			return 1;
		}
		
	
}
class Point{
	public Point(char c, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	char value; 
	int y;
	int x;
	int ans;
	
	
}
