package coreJava;

// Calling another constructor in the same class from another
// constructor is called constructor chaining.
// By using this(), we can call another constructor in the same class.
// In case, we want to call another constructor, this() should be the first
// line in the constructor.

public class constructorChaining {
	
	public constructorChaining() {
		System.out.println("In default constructor");
	}
	
    public constructorChaining(int i) {
    	this();
    	System.out.println("In single parametrized constructor");
		
	}
    
    public constructorChaining(int i, int j) {
		this(j);
		System.out.println("In double parametrized constructor");
	}
    
    public static void main(String[] args) {
		constructorChaining cc = new constructorChaining(10, 20);
	}

}

//Output
//-------
//In default constructor
//In single parametrized constructor
//In double parametrized constructor
//
