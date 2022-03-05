package devops;

public class gameDev1 {
	/*
	 * 브론즈 : 30일간 0-10000
	 * 실버 : 30일간 10000-20000
	 * 골드 : 30일간 20000-50000
	 * 플래 : 30일간 50000-100000
	 * 다이아 : 30일간 10<
	 */

	public static void main(String[] args) {
		gameDev1 ob = new gameDev1();
		
		String purchase [] = {"2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000"};
		int ans[] = ob.solution(purchase);
		System.out.println(ans.toString());

	}
	
	public int[] solution(String[] purchase) {
		int[] answer = new int [5];
		int calender[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String date[] = new String[purchase.length];
		int price [] = new int[purchase.length];
		
		for(int i = 0 ;i<purchase.length; i++) {
			
		}
        
        
        
        return answer;
    }

}
