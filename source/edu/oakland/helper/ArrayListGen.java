package edu.oakland.helper;

/**
*This class is responsible for generating an ArrayList from
*an int[] array provided by team 1
*@author Team 2
*@version "version 1.0 033116" 
*@since "version 1.0"
*/

import java.util.*;

public class ArrayListGen extends ArrayList<Integer>{
<<<<<<< HEAD

	/**
	*array is used to create the ArrayList
	*/
	private int[] array;
=======
>>>>>>> 7ef5d3c9d1269af6a10e287f19793e6624797ffa
	
	/**
	*The ArrayListGen method creates the ArrayList
	*and sets it equal to the provided int array
	*@param array int array used in order to create the ArrayList
	*/
	public ArrayListGen(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			add(i);
		}
	}
  
}
