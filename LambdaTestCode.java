
public class LambdaTestCode {

	public static void main(String[] args) {
		
		int a ,b; 
		a= 3; 
		b=5;
		int result = addFunction(a,b);
		System.out.println(result);

	}
	
	private static int addFunction(int a, int b) {
		return a+b;
	}

}
