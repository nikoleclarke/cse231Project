package edu.oakland.helper;
import java.util.*;

public class ArrayListHelper {

	private long startTime;
	private long endTime;
	private long totalTime;
	private long startSortTime, endSortTime, totalSortTime;

	private ArrayList<Integer> arrayList;

	public ArrayListHelper(ArrayList<Integer> arrayList){
		this.arrayList = arrayList;
	}

		public ArrayList<Integer> bubbleSort(){

		/*
		* i starts at the end of the array As it is decremented all
		* indexes greater then they are sorted
		*/
		
		startSortTime = System.currentTimeMillis();

		for (int i = arrayList.size() - 1; i > 1; i--) {

		/*
		*The inner loop starts at the beginning of the array and
		*compares each value next to each other. If the value is greater
		* then they are swapped
		*/

			for (int j = 0; j < i; j++) {

				//To change sort to Decending change

				if (arrayList.get(j) > arrayList.get(j +1)) {
					swapValues(j, j+1);
				}

			}

		  }
		  
		  endSortTime = System.currentTimeMillis();
		  totalSortTime = endSortTime - startSortTime();
		  
		  System.out.println("Time elapsed during bubble sort: " + (totalSortTime) + " milliseconds.");
		  
		  return arrayList;
	  }

public void swapValues(int indexOne, int indexTwo) {
	int temp = arrayList.get(indexOne);
	arrayList.set(indexOne, arrayList.get(indexTwo));
	arrayList.set(indexTwo, temp);
}

public int find(int number) {
	startTime = System.currentTimeMillis();
	int result = find(number, 0, arrayList.size()-1);
	endTime = System.currentTimeMillis();
	totalTime = System.out.println("Finding the odd numbers took " + (endTime - startTime));
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
}
