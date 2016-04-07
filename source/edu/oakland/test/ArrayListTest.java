package edu.oakland.test;

import java.util.*;
import junit.framework.TestCase;
import edu.oakland.helper.*;

public class ArrayListTest extends TestCase{
	
	private int[] finalArray;
	private ArrayList<Integer> sortedArrayList;
	private ArrayListHelper aListHelper;
	
	public void setUp(){
		//Test array
		int[] intArray = {200, 150, 390, 20, 500, 1010, 971, 850, 90, 430};
		int[] finalArray = {971, -1};
		
		//Initialize files
		ArrayListGen arrayList = new ArrayListGen(intArray);
		aListHelper = new ArrayListHelper(arrayList);
	}

	public void testSort(){
		//assertArrayEquals(finalArray, aListHelper.getValues()); //result -> sortedArrayList.get... get first two in array
		assertNotNull(aListHelper.getTime());
		assertNotNull(aListHelper.getSortTime());
	}

}
