package T1.스킬트리;

public class Solution {
    public static void main(String[] args) {
        String skill = "";
        String [] skill_trees  = {};
        int ans = solution(skill, skill_trees);
        System.out.println(ans);
    }

    public static int solution(String skill, String[] skill_trees) {
        char oder[] = skill.toCharArray();
        for(int i =0 ;i<skill_trees.length; i++){
            char tree[] = skill_trees[i].toCharArray();
            int chk=0;
            for(int j=0; j<tree.length; j++){

                for(int k =0; k<oder.length; k++){
                    if(oder[k] == tree[j]){

                    }
                }
            }
        }
        int answer = -1;
        return answer;
    }
}
