package 오늘의집;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int [][] beds = {{2,3,40}, {2,5,20}};
		int [][]tables=  {{1,1,30}};
		int cost = 10000;
		long answer = s.solution(beds, tables, cost);
		System.out.println(answer);
		
	}
	
	public long solution(int[][] beds, int[][] tables, int cost) {
		long ans =Long.MAX_VALUE;
		for(int i = 0 ;i<beds.length; i++) {
			long roomSize = (long) 0;
			for(int j = 0; j<tables.length ;j++) {
				int bPlusT = beds[i][0] * beds[i][1] + tables[j][0] * tables[j][1] ;
				int tmp[] = new int[12];
				tmp[0] =beds[i][0] * tables[j][0];
				tmp[1] =beds[i][0] * tables[j][1];
				tmp[2] =beds[i][1] * tables[j][0];
				tmp[3] =beds[i][1] * tables[j][1];
				tmp[4] =(beds[i][0]+1) * tables[j][0];
				tmp[5] =(beds[i][0]+1) * tables[j][1];
				tmp[6] =(beds[i][1]+1) * tables[j][0];
				tmp[7] =(beds[i][1]+1) * tables[j][1];
				tmp[8] = beds[i][0] * (tables[j][0]+1);
				tmp[9] = beds[i][0] * (tables[j][1]+1);
				tmp[10] = beds[i][1] * (tables[j][0]+1);
				tmp[11] = beds[i][1] * (tables[j][1]+1);
				
				for( int k = 0 ;k<12; k++) {
					if(bPlusT < tmp[k]) {
						System.out.println(bPlusT + " " + i + " " + j + " " +tmp[k]);
						long total = beds[i][2] + tables[j][2] + cost*tmp[k]; 
						ans =  ans>total ? total:ans;
					}
				}
				
			}
		}
		
		return ans;
	}

}

