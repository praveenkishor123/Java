package coreJava;

// In Java, when final keyword is used with a variable of primitive
// data types (int, float, etc.), then the value of variable cannot be changed.

public class finalVariable {

	    public static void main(String args[]) {
	        final int i = 10;
	        i = 30; // Error because i is final.
	    }
	
}
