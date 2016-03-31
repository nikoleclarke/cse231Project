package edu.oakland.helper;
import java.util.*;

public class ArrayListHelper{

  private ArrayList<Integer> arrayList;

  public ArrayListHelper(ArrayList<Integer> arrayList){
    this.arrayList = arrayList;
  }


  public int find(int number){
    return find(number, 0, arrayList.size()-1);
  }

  private int find(int number, int left, int right){
    int elementIndex = (right-left)/2;
    elementIndex += left;
    int element = arrayList.get(elementIndex);

    if(number < element){
      find(number, left, elementIndex);
    }else if (number > element){
      find(number, elementIndex, right);
    }

    return element;
  }
}
