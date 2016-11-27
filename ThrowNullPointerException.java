package coreJava;

public class ThrowNullPointerException {
	
	public static void main(String[] args) {
		ThrowNullPointerException m = new ThrowNullPointerException();
		
		try {
			for(int i=0; i<5; i++) {
				m.getJunk();
				System.out.println(i);
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public void getJunk() throws NullPointerException {
		System.out.println("Hello World");
	}

}


//
//Output
//------
//Hello World
//0
//Hello World
//1
//Hello World
//2
//Hello World
//3
//Hello World
//4
