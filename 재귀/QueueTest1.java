package 알고리즘다시듣기;

import java.util.LinkedList;

public class QueueTest1 {

	private static String s;

	public static void main(String[] args) {
		
		LinkedList<String> q = new LinkedList<String>();
		q.offer("1");
		q.offer("2");
		q.offer("3");
		
		while(!q.isEmpty()) {
			//s = q.poll();
			System.out.println(q.poll());
		}
//		for(int i =0; i<=q.size(); i++) {
//			s = q.poll();
//			
//			System.out.println(s);
//		}
		
	}
}
