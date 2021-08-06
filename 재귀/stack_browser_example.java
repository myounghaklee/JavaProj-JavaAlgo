package 알고리즘다시듣기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_browser_example {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		String input = null;
		String current = "http://www.ssafy.com";
		
		Stack<String> back = new Stack<>();
		Stack<String> forward = new Stack<>();
		
		while(true) {
			input = br.readLine();
			if(input.charAt(0)=='Q')break;
			
			st = new StringTokenizer(input, " ");
			switch(st.nextToken().charAt(0)) {
			
			case 'V' : 
				forward.clear();
				back.push(current);
				current = st.nextToken();
				System.out.println(current);
				break;
				
			case 'B':
				if(back.isEmpty()) {
					System.out.println("Ignored");;
				}
				else {
				forward.push(current);
				current = back.pop();
				System.out.println(current);
				}
				break;
				
			case 'F':
				if(forward.isEmpty()) {
					System.out.println("F Ignored");
					
				}else {
					back.push(current);
					current = forward.pop();
					System.out.println(current);
				}
				break;
				
			}
		}
		
		
	}
}
