package edu.oakland.helper;

/**
*This class is responsible for generating an ArrayList from
*an int[] array provided by team 1
*@author Dillon Smedley, Corey Piasecki, Team 2
*@version "version 1.0 033116" 
*@since "version 1.0"
*/

import java.util.*
public class ArrayListGen{

	private int[] array;
  
	/**
	*list is used to create the ArrayList
	*/
	private ArrayList<Integer> list;

	/**
	*The generateArrayList method creates the ArrayList
	*and sets it equal to the provided int array
	*@param array int array used in order to create the ArrayList
	*@return the results of the ArrayList
	*/
	public ArrayList<Integer> generateArrayList(int[] array) {
		
		list = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(i);
		}	
		
		return list;
		
	}
	
	
	/**
	*The getArrayList method returns the value of created from generateArrayList
	*@return the results of the ArrayList
	*/
	public ArrayList<Integer> getArrayList(){
		return list;	
	}
  
}
