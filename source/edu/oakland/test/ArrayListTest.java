package edu.oakland.test;

import java.util.*;
import junit.framework.TestCase;
import edu.oakland.helper.*;

public class ArrayListTest extends TestCase{
	
	private int[] intArray;
	private ArrayList<Integer> arrayList;
	private ArrayList<Integer> sortedArrayList;
	
	public void setUp(){
		ArrayListGen aListGen = new ArrayListGen();
		ArrayListHelper aListHelper;
		
		intArray = new int[20];
		
		for (int i = 0; i < intArray.length; i++) {
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
