package edu.oakland.helper;
import java.util.*;

/**
*This class is responsible for sorting the ArrayList and finding
*the first two odd integers between 400 and 4000 along with
*the Big O' Notation for everything
*@author Team 2
*@version "version 2.0 033116" 
*@since "version 1.0"
*/

public class ArrayListHelper {

	/**
	*Time variables are used to find Big O' Notation
	*
	*/
	private long startTime, endTime, totalTime;
	private long timeMicro, timeMilli;
	private long startSortTime, endSortTime, totalSortTime;
	private long sortTimeMicro, sortTimeMilli;

	private ArrayList<Integer> arrayList;
	private int[] values;

	public ArrayListHelper(ArrayList<Integer> arrayList){
		this.arrayList = arrayList;
		this.bubbleSort();
		//this.find();
	}

	private void bubbleSort(){

		/**
		*I starts at the end of the array As it is decremented all
		*indexes greater then they are sorted
		*/
		
		startSortTime = System.nanoTime();
		
		for (int i = arrayList.size() - 1; i > 1; i--) {
		
		/**
		*The inner loop starts at the beginning of the array and
		*compares each value next to each other. If the value is greater
		*then they are swapped
		*/
		
		for (int j = 0; j < i; j++) {
		
			//To change sort to Decending change
		
			if (arrayList.get(j) > arrayList.get(j +1)) {
				swapValues(j, j+1);
			}
		
		}
		
		}
		
		endSortTime = System.nanoTime();
		totalSortTime = endSortTime - startSortTime;
		sortTimeMicro = (totalSortTime/1000);
		sortTimeMilli = (sortTimeMicro/1000);
		
		System.out.println("Time elapsed during bubble sort: " + (totalSortTime) + " nanoseconds.");
		System.out.println((sortTimeMicro) + " microseconds.");
		System.out.println((sortTimeMilli) + " milliseconds.");
		
	}

	public void swapValues(int indexOne, int indexTwo) {
		int temp = arrayList.get(indexOne);
		arrayList.set(indexOne, arrayList.get(indexTwo));
		arrayList.set(indexTwo, temp);
	}

	public int find(int number) {
		startTime = System.nanoTime();
		int result = find(number, 0, arrayList.size()-1);
		endTime = System.nanoTime();
		totalTime = (endTime - startTime);
		
		timeMicro = (totalTime/1000);
		timeMilli = (timeMicro/1000);
		
		System.out.println("Time elapsed during array search: " + (totalTime) + " nanoseconds.");
		System.out.println((timeMicro) + " microseconds.");
		System.out.println((timeMilli) + " milliseconds.");
		
		return result;
	}
	
	public long getTime() {
		return totalTime;
	}
	
	public long getSortTime(){
		return totalSortTime;
	}
	
	private int find(int number, int left, int right) {
		int elementIndex = (right-left)/2;
		elementIndex += left;
		int element = arrayList.get(elementIndex);
	
		if (number < element) {
			find(number, left, elementIndex);
		} else if (number > element){
			find(number, elementIndex, right);
		}
	
	return element;
	}
	
	public int[] getValues(){
		return values;	
	}
}
