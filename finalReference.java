// When final is used with non-primitive variables (references to objects), the
// members of the referred object can be changed.
// final for non-primitive variables just means that they cannot be changed to refer 
// to any other object.

package coreJava;

class Test1 {
	int i = 10;
}

public class finalReference {
	public static void main(String args[]) {
		final Test1 t1 = new Test1();
		t1.i = 30; // Works
	}
}
