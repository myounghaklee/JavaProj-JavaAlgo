package 알고리즘다시듣기;

import java.util.Scanner;

public class PowerSetTest {

	//private static final boolean[] IsSelected = null;
	private static boolean[] isSelected;
	private static int[] input;
	static int N, totalCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		for(int i =0 ;i<N ; i++) {
			input[i] = sc.nextInt();
		}
		generateSubSet(0);

	}
	
	private static void generateSubSet(int cnt ){
		
		if(cnt == N) {
			++totalCnt;
			for(int i =0; i<N; i++) {
				System.out.print((isSelected[i]?input[i]:"x")+ "\t");				
			}
			System.out.println();			
			return;
		}
		
		//선택 
		isSelected[cnt] = true;
		generateSubSet(cnt+1);
		//선택 안했을때 
		isSelected[cnt] = false;
		generateSubSet(cnt+1);
		}
}
