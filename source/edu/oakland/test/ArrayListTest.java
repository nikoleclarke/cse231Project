package edu.oakland.test;

import junit.framework.TestCase;
import edu.oakland.helper.*;

public class ArrayListTest extends TestCase{
	public void setUp(){
		private int[] intArray;
		private ArrayList<Integer> arrayList;
		private ArrayList<Integer> sortedArrayList;
		ArrayListGen aListGen = new ArrayListGen();
		ArrayListHelper aListHelper;
		
		intArray = new int[20];
		
		for (int i = 0; i < length; i++) {
			intArray[i] = i+1;
		}
		
		aListGen.generateArrayList(intArray);
		arrayList = aListGen.getArrayList();
		
		aListHelper = new ArrayListHelper(arrayList);
		sortedArrayList = aListHelper.bubbleSort();
		
		
			
	}

	public void testSort(){

	}
}
