package edu.oakland.test;

import java.util.*;
import junit.framework.TestCase;
import edu.oakland.helper.*;

/**
*This class is responsible for testing all of the functions
*of the other files 
*@author Team 2
*@version "version 3.0 033116" 
*@since "version 1.0"
*/

public class ArrayListTest extends TestCase{
	
	private int[] finalArray;
	private ArrayList<Integer> sortedArrayList;
	private ArrayListHelper aListHelper;
	
	public void setUp(){
		//Test array
		int[] intArray = {200, 150, 391, 20, 500, 1011, 971, 850, 90, 430};
		int[] finalArray = {971, 1011};
		
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
