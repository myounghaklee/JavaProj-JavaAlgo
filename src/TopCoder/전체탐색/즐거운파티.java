package TopCoder.전체탐색;

import java.util.HashMap;

public class 즐거운파티 {

	public static void main(String[] args) {

		String first[] = {"variety", "diversity", "loquacity", "courtesy"};
		String second[] = {"talking", "speaking", "discussion", "meeting"};
		
		int ans = bestInvitation(first,second);
		System.out.println("====ans111=====: " + ans);
		ans =bestInvitation2(first,second);
		System.out.println("====ans222=====: " + ans);
		
	}

	private static int bestInvitation2(String[] first, String[] second) {
		HashMap<String,Integer> dic = new HashMap<String, Integer>();
		for(int i = 0 ;i< first.length; i++) {
			dic.put(first[i], 0);
			dic.put(second[i], 0);
		}
		for(int i = 0 ;i<first.length; i++) {
			dic.put(first[i], dic.get(first[i])+1);
			dic.put(second[i], dic.get(second[i])+1);
		}
		int ans = 0;
		for(String s: dic.keySet()) {
			ans = Math.max(ans,  dic.get(s));
		}
		
		return ans;
	}

	private static int bestInvitation(String[] first, String[] second) {
		int i, j ; 
		int ans = 0;
		
		 for(i=0; i<first.length; i++) {
			 int f=0; 
			 int s = 0;
			 for(j=0; j<first.length; j++) {
				 if(first[i].equals(first[j]))f++;
				 if(first[i].equals(second[j]))f++;
				 if(second[i].equals(first[j]))s++;
				 if(second[i].equals(second[j]))s++;
			 }
			 
			 ans = Math.max(f,ans);
			 ans = Math.max(s,ans);
		 }
		return ans;
	}

}
