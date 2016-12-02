/*
 * SelectionSort.java
 *
 * I pledge my honor that I have abided by the Stevens Honor System.
 * Ron George
 * 
 */

package FinalProject;

import java.util.Arrays;

/**
 * @author Ron George
 * @version 1.0
 * @since 20161115
 * 
 */

public class SelectionSort {
  public static final String NAME = "Ron George";
  
  public int[] sort(int[] arr, String order){
    if (arr == null) return null;
    
    for (int i = 0; i < arr.length-1; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if(arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr [smallest] = temp;
    }
    
    if (order.equals("asc")) return arr;
    else if (order.equals("desc")) {
      for (int i = 0; i < arr.length; i++) {
        if (i == arr.length-i-1) return arr;
        
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
      }
      
      return arr;
    } else {
      System.out.println("Enter either \"asc\" or \"desc\" for a sorting order.");
      return arr;
    }
  }
}
