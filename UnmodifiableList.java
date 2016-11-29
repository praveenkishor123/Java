package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableList {

	public static void main(String args[]) {

		List<String> contents = new ArrayList<String>();

		// initializing List in Java
		contents.add("Example");
		contents.add("Tutorial");
		contents.add("Program");
		contents.add("Tips");

		contents = Collections.unmodifiableList(contents);
		
		contents.add("Can I add object into read only List - No"); 

		System.out.println(contents);
	}

}

//Output
//-----------------------------------------------------------------------------
//Exception in thread "main" java.lang.UnsupportedOperationException
//at java.util.Collections$UnmodifiableCollection.add(Unknown Source)
//at coreJava.UnmodifiableList.main(UnmodifiableList.java:25)
//
//
