import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_1302_º£½ºÆ®¼¿·¯ {
	private static int N;
	private static String book;
	private static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st ;
		N = sc.nextInt();
		HashMap<String, Integer> map= new HashMap<>();
		for(int i =0; i<N; i++) {
			//st = new StringTokenizer(br.readLine(), " ");
			book = sc.next();
			if(!map.containsKey(book))
				map.put(book, 1);
			else {
				map.put(book, map.get(book)+1);
			}
		}
		
		for(String s : map.keySet()) {
			max = Math.max(max, map.get(s));
		}
		ArrayList<String> list = new ArrayList<String>();
		
		for(String a : map.keySet()) {
			if(max == map.get(a)) {
				list.add(a);
				//System.out.println(a);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
