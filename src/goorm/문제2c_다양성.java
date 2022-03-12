package goorm;

import java.util.HashMap;
import java.util.Scanner;

public class 문제2c_다양성 {
	public static final Scanner scanner = new Scanner(System.in);
	public static int getElementTypeCount(int[] data, int n)
	{
			int countType = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i = 0;i<n ;i++) {
				map.put(data[i], data[i]);
			}
			
			return map.size();

			//return countType;
	}

	public static void main(String[] args) throws Exception {
			int n = scanner.nextInt();
			int[] data = new int[n];
			for(int i = 0 ; i < n ; i++)
			{
					data[i] = scanner.nextInt();
			}

			int answer= getElementTypeCount(data, n);

			System.out.println(answer);
	}

}