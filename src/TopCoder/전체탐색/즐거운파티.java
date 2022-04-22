package TopCoder.전체탐색;

public class 즐거운파티 {

	public static void main(String[] args) {

		String first[] = {"variety", "diversity", "loquacity", "courtesy"};
		String second[] = {"talking", "speaking", "discussion", "meeting"};
		
		int ans = bestInvitation(first,second);
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
