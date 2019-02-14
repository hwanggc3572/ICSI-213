// Name: Gyuchan Hwang
// Student ID: 001336372

import java.util.Random; // For Random class textbook p.249 ~ 255

public class Module3Assignment {
 static int sumBasicQuick=0; // Sum of the comparisons of the Basic Quick sort
 static int sumRPQuick=0; // Sum of the comparisons of the Random Pivot Quick sort
 static int sumMOTPQuick=0; // Sum of the comparisons of the Median of three Partitioning Quick sort
 static int sumOriginal=0; // Sum of the comparisons of the Original lists
 static int sumSorted=0; // Sum of the comparisons of the Sorted lists
 static int sumReverse=0; // Sum of the comparisons of the Reverse sorted lists
 
 // Create a Random object
 static Random randomNumbers = new Random();
   
 public static void main(String[] args) {
  
  
  
  // Make 1000 items
  System.out.println("1000 items");
  
  // Do this 10 times
  for(int i=0; i<10; i++)
   {
     int[] arr = new int[1000];
     for(int j=0; j<1000; j++)
     {
      // 0 ~ 99 random numbers
      arr[j] = randomNumbers.nextInt(100);
     }
     int[] arrSorted = new int[arr.length];
     int[] arrReverseSorted = new int[arr.length];
     
     // Original, Sorted, Reverse Sorted lists for each quick sort
     int[] arrBasicQuick = new int[arr.length];
     int[] arrBasicQuickSorted = new int[arr.length];
     int[] arrBasicQuickReverse = new int[arr.length];
     int[] arrRPQuick = new int[arr.length];
     int[] arrRPQuickSorted = new int[arr.length];
     int[] arrRPQuickReverse = new int[arr.length];
     int[] arrMOTPQuick = new int[arr.length];
     int[] arrMOTPQuickSorted = new int[arr.length];
     int[] arrMOTPQuickReverse = new int[arr.length];
     
     for(int k=0; k<arr.length; k++)
     {
      arrSorted[k] = arr[k];
      arrReverseSorted[k] = arr[k];
      // Original lists for each quick sort
      arrBasicQuick[k] = arr[k];
      arrRPQuick[k] = arr[k];
      arrMOTPQuick[k] = arr[k];
     }
     Sorted.bubbleSort(arrSorted);
     ReverseSorted.bubbleSort(arrReverseSorted);
     
     for(int l=0; l<arr.length; l++)
     {
      // Sorted lists for each quick sort
      arrBasicQuickSorted[l] = arrSorted[l];
      arrRPQuickSorted[l] = arrSorted[l];
      arrMOTPQuickSorted[l] = arrSorted[l];
      
      // Reverse Sorted lists for each quick sort
      arrBasicQuickReverse[l] = arrReverseSorted[l];
      arrRPQuickReverse[l] = arrReverseSorted[l];
      arrMOTPQuickReverse[l] = arrReverseSorted[l];
     }
     
     System.out.println("\nOriginal order:" );
     for (int element : arr)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order(ascending):" );
     for (int element : arrSorted)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nReverse sorted order(descending):" );
     for (int element : arrReverseSorted)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     // sort original, sorted, reverse sorted lists by each quick sort
     BasicQuickSort.quickSort(arrBasicQuick);
     RandomPivotQuickSort.quickSort(arrRPQuick);
     MedianOfThreePartitioning.quickSort(arrMOTPQuick);
     
     // calculate the number of comparisons of original lists
     sumOriginal = sumBasicQuick + sumRPQuick + sumMOTPQuick - sumReverse - sumSorted;
     
     BasicQuickSort.quickSort(arrBasicQuickSorted);
     RandomPivotQuickSort.quickSort(arrRPQuickSorted);
     MedianOfThreePartitioning.quickSort(arrMOTPQuickSorted);
     
     // calculate the number of comparisons of sorted lists
     sumSorted = sumBasicQuick + sumRPQuick + sumMOTPQuick - sumOriginal - sumReverse;
     
     BasicQuickSort.quickSort(arrBasicQuickReverse);
     RandomPivotQuickSort.quickSort(arrRPQuickReverse);
     MedianOfThreePartitioning.quickSort(arrMOTPQuickReverse);
     
     // calculate the number of comparisons of reverse sorted lists
     sumReverse = sumBasicQuick + sumRPQuick + sumMOTPQuick - sumSorted - sumOriginal;
     
     /* It will take more than five minutes so I write this as statements
      * These are arrays of each list performed by each quick sort
     // display
     System.out.println("\nSorted order by basic quick sort(original):");
     for(int element : arrBasicQuick)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by basic quick sort(sorted):");
     for(int element : arrBasicQuickSorted)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by basic quick sort(reverse sorted):");
     for(int element : arrBasicQuickReverse)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     
     System.out.println("\nSorted order by random pivot quick sort(original):");
     for(int element : arrRPQuick)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by random pivot quick sort(sorted):");
     for(int element : arrRPQuickSorted)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by random pivot quick sort(reverse sorted):");
     for(int element : arrRPQuickReverse)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by median of three partitioning quick sort(original):");
     for(int element : arrMOTPQuick)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by median of three partitioning quick sort(sorted):");
     for(int element : arrMOTPQuickSorted)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     
     System.out.println("\nSorted order by median of three partitioning quick sort(reverse sorted):");
     for(int element : arrMOTPQuickReverse)
     {
      System.out.print(element + " ");
     }
     
     System.out.println( );
     */
    }
    
    
    // Find the average comparisons of each sort
    System.out.println("\nAverage comparisons of Basic Quick Sort = " + (double)sumBasicQuick/30);
    System.out.println("Average comparisons of Random Pivot Quick Sort = " + (double)sumRPQuick/30);
    System.out.println("Average comparisons of Random Median of Three Partitioning Quick Sort = " + (double)sumMOTPQuick/30);
    System.out.println("Average comparisons of original lists = " + (double)sumOriginal/30);
    System.out.println("Average comparisons of sorted lists = " + (double)sumSorted/30);
    System.out.println("Average comparisons of reverse sorted lists = " + (double)sumReverse/30);
    
   }
  
 
 // Bubble Sort, Make sorted order of list
 public static class Sorted
 {

  public static void bubbleSort(int[] array)
  {
   int lastPos;
   int index;
   int temp;
   
   for(lastPos = array.length-1; lastPos>=0; lastPos--)
   {
    for(index=0; index <= lastPos-1; index++)
    {
     if(array[index]>array[index+1])
     {
      temp = array[index];
      array[index] = array[index + 1];
      array[index + 1] = temp;
     }
    }
   }
  }
 }
 
 // Bubble Sort, Make reverse sorted order of list
 public static class ReverseSorted
 {

  public static void bubbleSort(int[] array)
  {
   int lastPos;
   int index;
   int temp;
   
   for(lastPos = array.length-1; lastPos>=0; lastPos--)
   {
    for(index=0; index <= lastPos-1; index++)
    {
     if(array[index]<array[index+1])
     {
      temp = array[index];
      array[index] = array[index + 1];
      array[index + 1] = temp;
     }
    }
   }
  }
 }

 
 // Basic Quick Sort
  public static class BasicQuickSort
  {
   static int quickCount; // for counting the number of comparisons of each quick sort
   
   public static void quickSort(int array[])
   {
    quickCount = 0; // every time, reset the quickCount, if not, it becomes cumulative
    doQuickSort(array, 0, array.length-1);
    System.out.println("\nThe number of the comparisons(Basic Quick Sort): " + quickCount);
    
   }
   
   private static void doQuickSort(int array[], int start, int end)
   {
    int pivotPoint;
    
    if(start < end)
    {
     pivotPoint = partition(array, start, end);
     
     doQuickSort(array, start, pivotPoint-1);
     
     doQuickSort(array, pivotPoint+1, end);
     
    }
   }
   
   private static int partition(int array[], int start, int end)
   {
    int pivotValue;
    int endOfLeftList;
    int mid;
    
    mid = (start + end)/2;
    
    swap(array, start, mid);
    
    pivotValue = array[start];
    
    endOfLeftList = start;
    
    for (int scan = start + 1; scan <= end; scan++)
    {
     // where the comparisons are occurred
     quickCount++;
     sumBasicQuick++;
     
     if(array[scan] < pivotValue)
     {
      endOfLeftList++;
      swap(array, endOfLeftList, scan);
      
     }
    }
    
    swap(array, start, endOfLeftList);
    
    return endOfLeftList;
   }
   
   private static void swap(int[] array, int a, int b)
   {
    int temp;
    
    temp = array[a];
    array[a] = array[b];
    array[b] = temp;
   }
  
  }
  
  // Random Pivot Quick Sort
    public static class RandomPivotQuickSort
    {
     static int quickRPCount; // for counting the number of comparisons of each quick sort
     
     public static void quickSort(int array[])
     {
      quickRPCount = 0; // every time, reset the quickRPCount, if not, it becomes cumulative
      doQuickSort(array, 0, array.length-1);
      System.out.println("\nThe number of the comparisons(Random Pivot Quick Sort): " + quickRPCount);
      
     }
     
     private static void doQuickSort(int array[], int start, int end)
     {
      int pivotPoint;
      
      if(start < end)
      {
       pivotPoint = partition(array, start, end);
       
       doQuickSort(array, start, pivotPoint-1);
       
       doQuickSort(array, pivotPoint+1, end);
       
      }
     }
     
     private static int partition(int array[], int start, int end)
     {
      
      int endOfLeftList;
      int mid;
      int pivotValue;
      
      mid = (start + end)/2;
      
      swap(array, start, mid);
      
      // choose random pivot between start and end 
      pivotValue = array[start + randomNumbers.nextInt(end-start+1)];
      
      endOfLeftList = start;
      
      for (int scan = start + 1; scan <= end; scan++)
      {
       // where the comparisons are occurred
       quickRPCount++;
       sumRPQuick++;
       if(array[scan] < pivotValue)
       {
        endOfLeftList++;
        swap(array, endOfLeftList, scan);
        
       }
      }
      
      swap(array, start, endOfLeftList);
      
      return endOfLeftList;
     }
     
     private static void swap(int[] array, int a, int b)
     {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
     }
    
    }
    

    
    
    // Median Of Three Partitioning Quick Sort
    public static class MedianOfThreePartitioning
    {
     static int quickMOTPCount; // for counting the number of comparisons of each quick sort
     
     public static void quickSort(int array[])
     {
      quickMOTPCount = 0; // every time, reset the quickCount, if not, it becomes cumulative
      doQuickSort(array, 0, array.length-1);
      System.out.println("\nThe number of the comparisons(Median of Three Partitioning Quick Sort): " + quickMOTPCount);
      
     }
     
     private static void doQuickSort(int array[], int start, int end)
     {
      int pivotPoint;
      
      if(start < end)
      {
       pivotPoint = partition(array, start, end);
       
       doQuickSort(array, start, pivotPoint-1);
       
       doQuickSort(array, pivotPoint+1, end);
       
      }
     }
     
     private static int partition(int array[], int start, int end)
     {
      
      int mid = (start + end)/2;
      int pivotValue;
      int endOfLeftList;
      
      // first, compare the start, mid and end
      if(array[mid] < array[start])
       swap(array, start, mid);
      if(array[end] < array[start])
       swap(array, start, end);
      if(array[end] < array[mid])
       swap(array, end, mid);
      
      // select mid value as a pivot
      pivotValue = array[mid];
      
      // the reason of end-1 : start and end are already sorted
      swap(array, end-1, mid);
      
      endOfLeftList = start;
      
      for (int scan = start + 1; scan <= end; scan++)
      {
       // where the comparisons are occurred
       quickMOTPCount++;
       sumMOTPQuick++;
       if(array[scan] < pivotValue)
       {
        endOfLeftList++;
        swap(array, endOfLeftList, scan);
        
       }
      }
      
      swap(array, start, endOfLeftList);
      
      return endOfLeftList;
     }
     
     private static void swap(int[] array, int a, int b)
     {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
     }
     
    
    }
}