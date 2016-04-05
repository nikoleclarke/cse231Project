package edu.oakland.test;

import java.util.*;
import junit.framework.TestCase;
import edu.oakland.helper.*;

public class ArrayListTest extends TestCase{
	
	private int[] intArray;
	private int[] finalArray;
	private ArrayList<Integer> arrayList;
	private ArrayList<Integer> sortedArrayList;
	
	public void setUp(){
		ArrayListGen aListGen = new ArrayListGen();
		ArrayListHelper aListHelper;
		
		intArray = {20, 15, 39, 2, 50, 101, 97, 85, 9, 43};
		finalArray = {9, 15};	
		
		aListGen.generateArrayList(intArray);
		arrayList = aListGen.getArrayList();
		
		aListHelper = new ArrayListHelper(arrayList);
		sortedArrayList = aListHelper.bubbleSort();
			
	}

	public void testSort(){
		
		Assert.assertArrayEquals( finalArray, result ); //result -> sortedArrayList.get... get first two in array
	}

}
