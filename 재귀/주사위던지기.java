package ssafy;

import java.util.Arrays;

public class 주사위던지기 {

	static int [] numbers ;
	static int N = 6, R=3;
	private static boolean[] isSelected;
	private static int totalCnt;
	public static void main(String[] args) {
		numbers = new int [R];
		isSelected = new boolean[7];
		totalCnt =0;		
		dice1(0);
		System.out.println("경우의 수 : " + totalCnt);
		
		totalCnt = 0;
		dice2(0);
		System.out.println("경우의 수 : " + totalCnt);
		
		totalCnt = 0;
		dice3(0,1);
		System.out.println("경우의 수 : " + totalCnt);
		
		totalCnt = 0;
		dice4(0,1);
		System.out.println("경우의 수 : " + totalCnt);

	}
	
	//중복순열 (1,1,2)뽑힐 수 있음 
	//즉 첫번째애 뽑힌 수가 두번째, 세번째에 뽑힐수 있음
	private static void dice1(int cnt) {
		if(cnt ==R) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		//유도파트
		for(int i =1; i<=6; i++) {
			numbers[cnt] = i;
			dice1(cnt+1);
		}
	}
	
	//중복안됨nPr
	private static void dice2(int cnt) {
			if(cnt ==R) {
				totalCnt ++;
				System.out.println(Arrays.toString(numbers));
				return;
			}
			
			for(int i =1; i<=6; i++){
				if(isSelected[i])continue;
				
				numbers[cnt]= i;
				isSelected[i] = true;
				dice2(cnt+1);
				isSelected[i] = false;
			}
	}
	
	//(112,121,211)모두 같은거로 보고 처리하는 경우 -> 조합
	//하지만 1이 두번 뽑히는 경우는 인정하므로 중복조합!!!
	//중복조합 nHr : 6H3 : (n+r-1)Cr : 8C3 == 56가지
	private static void dice3(int cnt, int start) {
		if(cnt ==R) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for(int i = start; i<=6; i++) {
			numbers[cnt] =i;
			dice3(cnt+1, i);
		}
	}
	
	//일반 조합 
	private static void dice4(int cnt, int start) {
	
		if(cnt ==R) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for(int i = start; i<=6; i++) {
			
			numbers[cnt] =i;
			
			dice4(cnt+1, i+1);
			
		}
	}

}
