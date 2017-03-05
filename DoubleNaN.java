
// Java Double isNaN method example
// This example will show how to use isNaN method of Double class
class DoubleNaN {
	
	public static void main(String[] args) {
		
		double d = Math.sqrt(-10);
		
		boolean b1 = Double.isNaN(d);
		
		System.out.println(b1); // true
		
		Double dObj = new Double(d);
		
		boolean b2 = dObj.isNaN();
		
		System.out.println(b2); // true
		
	}

}
