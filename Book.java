
public class Book {
	
	private String title;
	
	public String getTitle() {
		return title;
		
	}



public static void main(String[] args) {
	
	Book b = new Book();
	
	String s = b.getTitle(); // compiles and runs
	
	String t = s.toLowerCase(); // Runtime exception - NullPointerException
	
	// We are getting the null pointer exception here
	// because the reference variable "title" does not point to an object.
	
}

}

