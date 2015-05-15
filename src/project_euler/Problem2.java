package project_euler;

public class Problem2 {

	public static void main(String[] args) {
		int result = 0;
		int a = 1;
		int b = 2;
		
		while(b <= 4000000){
			int oldB = b;
			
			if(b % 2 == 0){
				result += b;
			}
			
			b = a + b;
			a = oldB;	
		}
		
		System.out.println(result);
	}
}
