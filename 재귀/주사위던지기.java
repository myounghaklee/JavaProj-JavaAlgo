package ssafy;

import java.util.Arrays;

public class �ֻ��������� {

	static int [] numbers ;
	static int N = 6, R=3;
	private static boolean[] isSelected;
	private static int totalCnt;
	public static void main(String[] args) {
		numbers = new int [R];
		isSelected = new boolean[7];
		totalCnt =0;		
		dice1(0);
		System.out.println("����� �� : " + totalCnt);
		
		totalCnt = 0;
		dice2(0);
		System.out.println("����� �� : " + totalCnt);
		
		totalCnt = 0;
		dice3(0,1);
		System.out.println("����� �� : " + totalCnt);
		
		totalCnt = 0;
		dice4(0,1);
		System.out.println("����� �� : " + totalCnt);

	}
	
	//�ߺ����� (1,1,2)���� �� ���� 
	//�� ù��°�� ���� ���� �ι�°, ����°�� ������ ����
	private static void dice1(int cnt) {
		if(cnt ==R) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		//������Ʈ
		for(int i =1; i<=6; i++) {
			numbers[cnt] = i;
			dice1(cnt+1);
		}
	}
	
	//�ߺ��ȵ�nPr
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
	
	//(112,121,211)��� �����ŷ� ���� ó���ϴ� ��� -> ����
	//������ 1�� �ι� ������ ���� �����ϹǷ� �ߺ�����!!!
	//�ߺ����� nHr : 6H3 : (n+r-1)Cr : 8C3 == 56����
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
	
	//�Ϲ� ���� 
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
