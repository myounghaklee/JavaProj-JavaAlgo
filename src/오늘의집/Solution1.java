package 오늘의집;

import java.util.HashMap;

public class Solution1 {
	public static void main(String[] args) {
		Solution s = new Solution();

		String[][] rounds = { { "b", "a", "a", "d"}, {"b", "c", "a", "c"},{"b", "a", "d", "c" }};
		String a = "a";
		char[] str = a.toCharArray();

		System.out.println((int) (a.charAt(0) - 97));
		int answer = s.solution(rounds);
		System.out.println(answer);
	}

}

class Solution {
	public int solution(String[][] rounds) {
		int ans = 0;
		int tmp[][] = new int[rounds.length][4];
		int check[][] = new int[rounds.length][4];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < rounds.length; i++) {
			if (rounds.length < 1)
				return 0;
			for (int j = 0; j < 4; j++) {// int 배열로 형변환
				tmp[i][j] = (int) (rounds[i][j].charAt(0) - 97);
				//map.put(j, (int) (rounds[i][j].charAt(0) - 97));
				check[i][j] = -1;
			}
			
		}

		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < 4; j++) {// int 배열로 형변환
				if (i == 0) {
					int now = tmp[i][j] ; //j=0, now=1
					
					if ((j== tmp[i][tmp[i][j]]) && tmp[i][j]!=j) {
						//System.out.println("0커플링  : " + i + " " + j);
						check[i][j] = tmp[i][j];
						check[i][tmp[i][j]] = tmp[i][tmp[i][j]];
					}

				}
				if (tmp[i][j] == j) {
					System.out.println(tmp[i][j] + " " + i + "  : " + j);
					ans++; // 본인 지목
				}
				if (i >= 1) {
					//if(check[i-1][j]==1)ans ++;
					
					if ( check[i - 1][j] != -1 && check[i-1][j] == tmp[i][j])//  && tmp[i][j]!=j)
						ans++; // 이전에 커플이였을때

					if (j == tmp[i][tmp[i][j]] &&  tmp[i][j]!=j&& check[i - 1][j] == -1 ) {// 이전에// 커플이아닐떄
																												
						check[i][j] = tmp[i][j];
						check[i][tmp[i][j]] = tmp[i][tmp[i][j]];
					}
				}

			}
		}

		return ans;
	}
}
