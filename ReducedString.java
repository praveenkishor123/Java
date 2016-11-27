package coreJava;

import java.util.*;

public class ReducedString {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		scan.close();

		while(true) {

			int len = s.length();

			s = s.replaceAll("(.)\\1", "");

			if(s.length() == len) {

				break;

			}

		}

		System.out.println( (s.isEmpty()) ? "Empty String" : s);
	}
}


//Output
//---------
//Input - a a bbb
//Result - a

