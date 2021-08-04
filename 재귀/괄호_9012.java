package ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class °ýÈ£_9012 {
	private static int N;
	private static String S;
	private static Stack<Character> stack;
	private static char[] arr;
	private static boolean ans;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i =0; i<N ;i++) {
			ans = true;
			stack = new Stack<>();
			S = br.readLine();
			arr = S.toCharArray();
			for( int j =0 ;j<S.length(); j++) {
				if(arr[j]=='(') {
					stack.push(arr[j]);
				}
				
				else if(arr[j]==')'){
					if(!stack.isEmpty()) {
						stack.pop();
					}
					else {
						ans = false;
						break;
					}
				}
				
			}//end j for
			if(!stack.isEmpty()) ans = false;
			if(ans) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
