package 알고리즘다시듣기;

import java.util.Scanner;

public class boj_1120_문자열 {
	private static  String a;
	private static  String b;
	private static int ans = Integer.MAX_VALUE;
	private static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String a = sc.next();
		b = sc.next();
		
		for(int i =0 ;i<b.length()-a.length(); i++) {
			cnt =0;
			for(int j =0; j<a.length(); j++) {
				if(a.charAt(j)!=b.charAt(i+j)) cnt++;
			}
			ans = Math.min(cnt,ans);
		}
		System.out.println(ans);
		
		
		
	}
}
