import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Double(12.12D));
		
		list.add(new Double(11.24D));
		
		Double total = Double.valueOf(0.0D);
		
		for(Iterator iterator = list.iterator(); iterator.hasNext();) {
			Double d = (Double)iterator.next();
			
			total = total.doubleValue() + d.doubleValue();
			
			// System.out.println(total);   // 12.12
											// 23.36
		}
		
		// System.out.println(total);  // 23.36

	}
	
	

}
