import java.util.Scanner;

public class boj_1748_수이어쓰기1 {
	private static int N;
	private static String nTmp;
	private static int leng;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		nTmp = Integer.toString(N);
		leng = nTmp.length();
		//System.out.println(nTmp.length());
		int ansTmp = 0;
		switch(leng) {
		case 1:
			ansTmp = N;
			break;
			
		case 2: 
			ansTmp = 9 + ((N-10)+1)*2;
			break;
			
		case 3:  
			ansTmp = 9 + 90*2 + ((N-100)+1)*3;
			break;
		case 4: 
			ansTmp = 9 + 90 *2 + 900*3 + ((N-1000)+1)*4;
			break;
		case 5: 
			ansTmp = 9 + 90 *2 + 900*3 + 9000*4 + ((N-10000)+1)*5;
			break;
		case 6: 
			ansTmp = 9 + 90 *2 + 900*3 + 9000*4 +90000*5+  ((N-100000)+1)*6;
			break;
		case 7: 
			ansTmp = 9 + 90 *2 + 900*3 + 9000*4 +90000*5+ 900000*6 + ((N-1000000)+1)*7;
			break;
		case 8: 
			ansTmp = 9 + 90 *2 + 900*3 + 9000*4 +90000*5+ 900000*6 +9000000*7 + ((N-10000000)+1)*8;
			break;
			/*
			 * case 9: ansTmp = 99999999 + (N-100000000)+1; break
			 */
		default :
			ansTmp = 9 + 90 *2 + 900*3 + 9000*4 +90000*5+ 900000*6 +9000000*7 +90000000*8 +  ((N-100000000)+1)*9;
			break;
		}
		System.out.println(ansTmp);
		
		
			
	}
}
