package edu.oakland.test;

import junit.framework.TestCase;
import edu.oakland.helper.*;

public class ArrayListTest extends TestCase{
	public void setUp(){
		private int[] intArray;
		private ArrayList<integer> arrayList;
		ArrayListGen aListGen = new ArrayListGen();
			
		intArray = new int[20];
		
		for (int i = 0; i < length; i++) {
			intArray[i] = i+1;
		}
		
		aListGen.generateArrayList(intArray);
		arrayList = aListGen.getArrayList();
			
	}

	public void testSort(){

	}
}
