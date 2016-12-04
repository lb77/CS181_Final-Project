/*
 * Quicksort.java
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

public class Quicksort {
  private int[] arr;
  
  public int[] sort(int[] inArr, String order) {
    if (inArr == null || inArr.length == 0) return null;
    arr = inArr;
    
    quicksort(0, arr.length-1);
    
    return arr;
  }
  
  public void quicksort(int low, int high) {
    if (low >= high) return;
    
    int pivot = arr[low+(high-low)/2];
    
    int i = low;
    int j = high;
    
    while (i <= j) {
      while (arr[i] < pivot) i++;
      while (arr[j] > pivot) j--;
      
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    
    if (low < j) quicksort(low, j);
    if (i < high) quicksort(i, high);
  }
}
