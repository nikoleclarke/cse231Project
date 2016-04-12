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

	public boolean find(int number) {
		values = {-1,-1};
		startTime = System.currentTimeMillis();
		boolean result = find(0, arrayList.size()-1);
		boolean result = find();
		endTime = System.currentTimeMillis();
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
	private boolean find(){
		for(Iterator iterator = arrayList.iterator(); iterator.hasNext();){
			int element = iterator.next();
			if(element > 400 && element < 4000 && element % 2 == 1){
				if(value[0] != -1){
					value[0] = element;
				}else if(value[1] != -1){
						value[1] = element;
						return true;
				}
			}
		}
		return false;
	}
	private boolean find(int left, int right) {
	//
	// 	if(left >=  arrayList.size() || right >= arrayList.size()){
	// 		return false;
	// 	}
	//
	// 	int elementIndex = (right-left)/2;
	// 	elementIndex += (elementIndex+left < arrayList.size())? left : 0;
	// 	int element = arrayList.get(elementIndex);
	// 	int nextElement = arrayList.get(elementIndex+1);
	//
	// 	if(element > 400 && element < 4000 && element % 2 == 1){
	// 		value[0] = element;
	// 		if(nextElement > 400 && nextElement < 4000 && nextElement % 2 == 1){
	// 			value[1] = nextElement;
	// 			return true;
	// 		}
	// 	}
	//
	// 	if (4000 < element) {
	// 		find(left, elementIndex);
	// 	} else if (400 > element){
	// 		find(elementIndex, right);
	// 	}

	return false;
	}

	public int[] getValues(){
		return values;
	}
}
