import java.util.*;

public class ClearMyArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add("four");
		
		System.out.println("Actual array list: " + arr);
		
		arr.clear();
		
		System.out.println("After clear array list: " + arr);
		
	}

}


//
//Output
//------
//Actual array list: [one, two, three, four]
//After clear array list: []
