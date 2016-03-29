package edu.oakland.helper;

public class BubbleSorter {

	private int [] theArray;
	private int arraySize;
	
	public int[] bubbleSort(int[] someArray, int someArraySize){
			theArray = someArray;
			arraySize = someArraySize;
			
			/**
			* i starts at the end of the array As it is decremented all 
			* indexes greater then they are sorted
			*/
						
			for(int i = arraySize - 1; i > 1; 1--){
			
				/**
				*The inner loop starts at the beginning of the array and 
				*compares each value next to each other. If the value is greater
				* then they are swapped
				*/
				
				for(int j = 0; j < i; j++){ 
					
					//To change sort to Decending change 
				
					if(theArray [j] > theArray[j +1]) {
					
						swapValues(j, j+1);
						}
						
				}
			
			}
			return theArray;
	}
	
	public void swapValues(int indexOne, int indexTwo){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp; 
	}
}
	