package coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String args[]) {

		Map<String, String> unsortedMap = new HashMap<>();

		unsortedMap.put("apple", "a");
		unsortedMap.put("pineapple", "b");
		unsortedMap.put("banana", "c");
		unsortedMap.put("guava", "d");
		
		for(Map.Entry<String, String> entry : unsortedMap.entrySet()) {
			System.out.println("Unsorted key value: " + entry.getKey());
		}
		
		Map<String, String> treeMap = new TreeMap<String, String>(unsortedMap);
		for(Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Sorted key value: " + entry.getKey());
		}
	}
}

//
//Output
//-------------------
//Unsorted key value: banana
//Unsorted key value: apple
//Unsorted key value: pineapple
//Unsorted key value: guava
//Sorted key value: apple
//Sorted key value: banana
//Sorted key value: guava
//Sorted key value: pineapple
