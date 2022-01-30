package T3.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static int dy[]= {-1,1,0,0};
    private static int dx[] = {0,0,-1,1};
    private static int answer = Integer.MAX_VALUE;
     static boolean visited[][];
     static int yLeng, xLeng;

    public static void main(String[] args) {
        Solution s= new Solution();
        int [][] maps= {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        //int [][] maps= {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        int ans = s.solution(maps);
        System.out.println(ans);
    }
    static class Node{
        int y;
        int x;
        int cnt;

        public Node(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    }

    public int solution(int[][] maps) {
        //int answer = 0;
        yLeng = maps.length;
        xLeng = maps[0].length;
        visited = new boolean[yLeng][xLeng];
        visited[0][0] = true;
        bfs(0,0,0,maps);
        return answer;

    }

    private void bfs(int y, int x, int cnt, int map[][]) {
        if ((y == map.length - 1) && (x == map[0].length - 1)) {
            System.out.println(cnt + " " + answer);
            answer = answer >= cnt ? cnt : answer;

            if ((answer == 0) || (answer == 2147483647)) {
                answer = -1;
            }
            return;
        }
        Queue <Node> q = new LinkedList<>();
        q.add(new Node ( y,x,1));
        visited[y][x] = true;
        System.out.println("in bfs + : " + y + " " + x + " " +cnt );
        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < dy.length; i++) {
                int ny = node.y + dy[i];
                int nx = node.x + dx[i];
                if (ny >= 0 && ny < yLeng && nx >= 0 && nx < xLeng) {
                    if (map[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        q.offer(new Node(ny,nx, node.cnt+1));
//                        bfs(ny, nx, ++cnt, map);
//                        visited[ny][nx] = false;
                    }
                }
            }
        }

    }
}
