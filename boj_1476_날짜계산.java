import java.util.Scanner;

public class boj_1476_날짜계산 {
	private static int E;
	private static int S;
	private static int M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		E = sc.nextInt();
		S = sc.nextInt();
		M = sc.nextInt();
		
		int ans = 1;
		
		while(true) {
			if((ans-E)%15 ==0 && (ans-S)%28==0 && (ans-M)%19==0) {
				break;
			}
			ans ++;
		}
		System.out.println(ans);
	}
}
