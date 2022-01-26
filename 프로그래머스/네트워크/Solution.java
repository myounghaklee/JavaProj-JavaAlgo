package T3.네트워크;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int computers[][] = {};
        int ans = s.solution(3,computers );
        System.out.println(ans);

    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int visited[] = new int [n];
        for(int i = 0 ;i<n; i++){
            if(visited[i]!=1){
                dfs(computers, n, visited);
                answer++;
            }
        }

        return answer;
    }

    private int[] dfs(int[][] computers, int node, int[] visited) {
        visited[node] = 1;

        for (int idx=0; idx<computers.length; idx++) {
            if (node != idx && computers[node][idx] == 1 && visited[idx]!=1) {
                visited = dfs(computers, idx, visited);
            }
        }
        return visited;
    }


}
