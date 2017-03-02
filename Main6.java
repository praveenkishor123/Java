
public class Main6 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		long b = 20;
		
		short c = 30;
		
		System.out.println(a); // 10
		
		System.out.println(b); // 20
		
		// 11 + (20 * 30) = 611
		System.out.println(++a + b++ * c);  // 611
		
		System.out.println(a); // 11
		
		System.out.println(b); // 21
		
	}

}
