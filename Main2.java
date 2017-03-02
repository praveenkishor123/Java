import java.util.ArrayList;

class Main2 {
	
	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(12.45);
		
		list.add(11.24);
		
		Double total = 0.0;
		
		for(Double d : list)
			
			total = total + d;
		
		System.out.println(total);
		
	}

}

// Output = 23.689999999999998
//
