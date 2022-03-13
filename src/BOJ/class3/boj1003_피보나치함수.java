import java.util.Scanner;
 //재귀로 푸니깐 계속 시간초과,,,,
// Dp로 2중배열써서 해결
public class boj1003_피보나치함수 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[][] f = new int[41][2];
 
        f[0][0] = 1;
        f[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                f[i][j] = f[i - 1][j] + f[i - 2][j];
            }
        }
 
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
 
            System.out.println(f[d][0] + " " + f[d][1]);
 
        }
 
    }
 
}