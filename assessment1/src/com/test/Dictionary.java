package com.test;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	HashMap<Integer, String> dicCodeToIndex;
	public static void main (String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.dicCodeToIndex = new HashMap<Integer, String>();
		dictionary.dicCodeToIndex.put(1, "AAA");
		dictionary.dicCodeToIndex.put(2, "BBB");
		dictionary.dicCodeToIndex.put(3, "CCC");
		dictionary.dicCodeToIndex.put(4, "DDD");
		dictionary.printValue(1);
		dictionary.printValue(3);
	}
public void printValue(int key) {
	System.out.println(dicCodeToIndex.get(key));
}
}
