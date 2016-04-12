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
	
	/**
	*finalArray is the int array used to test the results
	*aListHelper is the instance of the helper used to get the 
	*/
	private int[] finalArray;
	private ArrayListHelper aListHelper;
	
	/**
	*setUp() method is used to create the test array and also create
	*the instance of ArrayListHelper use to get the results
	*/
	public void setUp(){
		//Test array
		int[] intArray = {200, 150, 391, 20, 500, 1011, 971, 850, 90, 430};
		int[] finalArray = {971, 1011};
		
		//Initialize files
		ArrayListGen arrayList = new ArrayListGen(intArray);
		aListHelper = new ArrayListHelper(arrayList);
	}

	/**
	*testSort() method checks the results of aListHelp giving a green or
	*red bar depending on the result.
	*/
	public void testSort(){
		//assertArrayEquals(finalArray, aListHelper.getValues()); //result -> sortedArrayList.get... get first two in array
		assertNotNull(aListHelper.getTime());
		assertNotNull(aListHelper.getSortTime());
	}

}
