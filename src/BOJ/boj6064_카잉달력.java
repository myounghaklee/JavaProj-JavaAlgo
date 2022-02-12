package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj6064_카잉달력 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int TC = Integer.parseInt(br.readLine());
		 
		while(TC-- > 0) {
			int cnt=0;
			//String s = br.readLine();
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			int nx= 1; int ny = 1;
			while(true) {
				//System.out.println(nx + " " + ny);
				
				if(nx==M && ny==N) {
				//	System.out.println("첫 번쨰 : " +nx  + " " + ny + " " + cnt );
					cnt =-1;
					break;
				}
				if(nx==X && ny==Y) {
				//	System.out.println("두 번쨰 : " +nx  + " " + ny+ " " + cnt);
					++cnt; 
					break;
				}
				
				if(nx==M && ny !=N) {
				//	System.out.println("세 번쨰 : " +nx  + " " + ny+ " " + cnt);
					nx=1; ny ++;
					cnt++;
					continue;
				   
				}
				if(nx!=M && ny==N) {
				//	System.out.println("네 번쨰 : " +nx  + " " + ny+ " " + cnt);
					nx++; ny = 1;
					cnt++;
					continue;
					
				}
				if(nx!=M && ny !=N) {
				//	System.out.println("다섯 번쨰 : " +nx  + " " + ny+ " " + cnt);
					nx++; ny ++;
					cnt++;
					continue;
				}
				
				
			}
			System.out.println(cnt);
			
		}//end TC
	}

}
