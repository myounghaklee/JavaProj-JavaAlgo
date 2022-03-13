package goorm;
import java.io.*;
import java.lang.*;
import java.util.*;


public class 문제2f_데스티니 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		Point2D[] points = new Point2D[n];

		for(int i = 0 ; i < n ; i++)
		{
			int x=  scanner.nextInt();
			int y=  scanner.nextInt();
			points[i] = new Point2D(x, y);
		}
		int minDist = Integer.MAX_VALUE;
		int minCnt =0;
		for(int i =0 ;i<n ;i++) {
			for(int j =0; i<n ;j++) {
				//<i,j> : i는 0~n-1이고 j는i보다 작은 모든쌍
				int spd = points[i].getSquaredDistanceTo(points[j]);
				if(spd <minDist) {
					minDist = spd;
					minCnt = 1;
				}else if(spd==minDist) {
					minCnt++;
				}
			}
		}
		System.out.printf("%.1f\n" , Math.sqrt(minDist));
		System.out.println(minCnt);

		
	}
}

class Point2D{
	int x;
	int y;
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * 2차원 평면 상에서 점 this부터 점 target까지 거리의 제곱을 계산하는 함수
	 * @param target
	 * @return
	 */
	public int getSquaredDistanceTo(Point2D target)
	{
		return (x-target.x)*(x-target.x) + (y-target.y)*(y-target.y);
	}

	public double getDistanceTo(Point2D target)
	{
		return Math.sqrt(this.getSquaredDistanceTo(target));
	}

}
