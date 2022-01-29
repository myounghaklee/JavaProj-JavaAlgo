package T3.단어변환;

public class Solution {
    private static int ans = 0;
    public static void main(String[] args) {
        Solution s= new Solution();
        String begin = "hit";
        String target = "cog";
        String words[] = {"hot", "dot", "dog", "lot", "log", "cog"};
        int ans = s.solution(begin, target, words);
        System.out.println(ans);

    }
    public int solution(String begin, String target, String[] words) {
        //int answer = 0;
        int visited[] = new int[words.length];


        for(int i =0; i<words.length; i++){
            int diff=0;
            String now = "";
            for(int j=0; j<begin.length(); j++){
                if(begin.charAt(j) != words[i].charAt(j)){
                    diff++;
                    now= words[i];
                }
            }
            if(diff==1){
                visited[i] = 1;
                bfs(begin, target,words, 1, now);
                visited[i] =0;
            }


        }
        return ans;
    }

    private void bfs(String begin, String target, String[] words, int cnt, String now) {
        if(begin.equals(target)){
            ans= cnt;
            return ;

        }



    }

    /*

    tatic boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
     */
}
