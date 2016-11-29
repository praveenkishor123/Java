package coreJava;

public class Circles {
	
	public static void main(String[] args) {
		
		int[] ia = {1, 3, 5, 7, 9};
		
		for(int x : ia) {
			for(int j=0; j<3; j++) {
				if(x > 4 && x < 8) continue;
				System.out.println(" " + x);
				if(j == 1) break;
				continue;
			}
			continue;
		}
	}

}

//
//Output
//--------------
//1
//1
//3
//3
//9
//9
