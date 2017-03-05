
/**
 * @author praveen kishor
 *
 */
public class StringSplit1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "one-two-three";
		
		String temp[];
		
		String delimiter = "-";
		
		temp = str.split(delimiter);
		
		for(int i=0; i < temp.length; i++)
			
			System.out.println(temp[i]);
		

	}

}
