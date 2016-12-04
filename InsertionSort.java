/*
 * InsertionSort.java
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

public class InsertionSort {
  public int[] sort(int[] arr) {
    if (arr == null) return null;
    
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int pos = i;
      
      while (pos > 0 && arr[pos-1] > temp) {
        arr[pos] = arr[pos-1];
        pos--;
      }
      
      arr[pos] = temp;
    }
    
    return arr;
  }
}
