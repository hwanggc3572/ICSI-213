// Name: Gyuchan Hwang
// Student ID: 001336372

import java.util.Random; // For Random class textbook p.249 ~ 255

public class Module2Assignment {
 static int sumBubble=0; // Sum of the comparisons of the Bubble sort
 static int sumInsertion=0; // Sum of the comparisons of the Insertion sort
 static int sumQuick=0; // Sum of the comparisons of the Quick sort
 static int sumListLength10=0; // Sum of the comparisons of the List Length 10 
 static int sumListLength100=0; // Sum of the comparisons of the List Length 100
 static int sumListLength1000=0; // Sum of the comparisons of the List Length 1000

 public static void main(String[] args) {
  
  // Create a Random object
  Random randomNumbers = new Random();
  
  
  
  
  
  System.out.println("\n10 items");
  for(int i=0; i<10; i++) // Do this 10 times
  {
   int[] arr = new int[10]; // length 10 array
   for(int j=0; j<10; j++)
   {
    arr[j] = randomNumbers.nextInt(100); // random integer items 0~99
   }
   
   // Copy the array for each sort
   int[] arrBubble = new int[arr.length]; 
   int[] arrInsertion = new int[arr.length];
   int[] arrQuick = new int[arr.length];
   
   for(int k=0; k<arr.length; k++)
   {
    arrBubble[k] = arr[k];
    arrInsertion[k] = arr[k];
    arrQuick[k] = arr[k];
   }
   
   // Print original array
   System.out.println("Original order:" );
   for (int element : arr)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   // Use each sort
   Bubble.bubbleSort(arrBubble);
   Insertion.insertionSort(arrInsertion);
   Quick.quickSort(arrQuick);
   
   // print the sorted array by bubble sort
   System.out.println("\nSorted order by bubble sort:");
   for(int element : arrBubble)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   // print the sorted array by insertion sort
   System.out.println("\nSorted order by insertion sort:");
   for(int element : arrInsertion)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   // print the sorted array by quick sort
   System.out.println("\nSorted order by quick sort:");
   for(int element : arrQuick)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   sumListLength10 = sumBubble + sumInsertion + sumQuick; // sumBubble, sumInsertion, sumQuick are cumulative
  }
  
  
  
  
  
  
  
  
  
  // Do the same process for 100 items
  System.out.println("100 items");
  for(int i=0; i<10; i++)
  {
   int[] arr = new int[100];
   for(int j=0; j<100; j++)
   {
    arr[j] = randomNumbers.nextInt(100);
   }
   int[] arrBubble = new int[arr.length];
   int[] arrInsertion = new int[arr.length];
   int[] arrQuick = new int[arr.length];
   
   for(int k=0; k<arr.length; k++)
   {
    arrBubble[k] = arr[k];
    arrInsertion[k] = arr[k];
    arrQuick[k] = arr[k];
   }
   
   System.out.println("Original order:" );
   for (int element : arr)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   Bubble.bubbleSort(arrBubble);
   Insertion.insertionSort(arrInsertion);
   Quick.quickSort(arrQuick);
   
   System.out.println("\nSorted order by bubble sort:");
   for(int element : arrBubble)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   System.out.println("\nSorted order by insertion sort:");
   for(int element : arrInsertion)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   System.out.println("\nSorted order by quick sort:");
   for(int element : arrQuick)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   // sumBubble, sumInsertion, sumQuick are cumulative, so must minus sumListLength10
   sumListLength100 = sumBubble + sumInsertion + sumQuick - sumListLength10; 
  }
  
  
  
  
  
  
  
  
  
  
  // Do the same process for 1000 items
  System.out.println("\n1000 items");
  for(int i=0; i<10; i++)
  {
   int[] arr = new int[1000];
   for(int j=0; j<1000; j++)
   {
    arr[j] = randomNumbers.nextInt(100);
   }
   int[] arrBubble = new int[arr.length];
   int[] arrInsertion = new int[arr.length];
   int[] arrQuick = new int[arr.length];
   
   for(int k=0; k<arr.length; k++)
   {
    arrBubble[k] = arr[k];
    arrInsertion[k] = arr[k];
    arrQuick[k] = arr[k];
   }
   
   System.out.println("Original order:" );
   for (int element : arr)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   Bubble.bubbleSort(arrBubble);
   Insertion.insertionSort(arrInsertion);
   Quick.quickSort(arrQuick);
   
   System.out.println("\nSorted order by bubble sort:");
   for(int element : arrBubble)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   System.out.println("\nSorted order by insertion sort:");
   for(int element : arrInsertion)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   System.out.println("\nSorted order by quick sort:");
   for(int element : arrQuick)
   {
    System.out.print(element + " ");
   }
   
   System.out.println( );
   
   // Same as sumListLength100, they are cumulative so minus sumListLength10 and sumListLength100
   sumListLength1000 = sumBubble + sumInsertion + sumQuick - sumListLength10 - sumListLength100;
  }
  
  // Find the average comparisons of each Length
  // divide by 30 because 10 bubble sort, 10 insertion sort, 10 quick sort
  System.out.println("Average comparisons of Length 10 = " + (double)sumListLength10/30); 
  System.out.println("Average comparisons of Length 100 = " + (double)sumListLength100/30);
  System.out.println("Average comparisons of Length 1000 = " + (double)sumListLength1000/30);
  
  // Find the average comparisons of each sort
  // divide by 30 because 10 length10, 10 length100, 10 length1000
  System.out.println("Average comparisons of Bubble Sort = " + (double)sumBubble/30);
  System.out.println("Average comparisons of Insertion Sort = " + (double)sumInsertion/30);
  System.out.println("Average comparisons of Quick Sort = " + (double)sumQuick/30);
 }
 
 
 
 
 
 
 
 
 
 // Bubble Sort
 public static class Bubble
 {

  public static void bubbleSort(int[] array)
  {
   int lastPos;
   int index;
   int temp;
   int bubbleCount=0; // for counting the number of comparisons of each bubble sort
   
   for(lastPos = array.length-1; lastPos>=0; lastPos--)
   {
    for(index=0; index <= lastPos-1; index++)
    {
     // where the comparisons are occurred
     bubbleCount++;
     sumBubble++;  
     if(array[index]>array[index+1])
     {
      temp = array[index];
      array[index] = array[index + 1];
      array[index + 1] = temp;

      
     }
    }
   }
   
   System.out.println("\nThe number of the comparisons(Bubble Sort): " + bubbleCount); // print the number of comparisons of bubble sort
  }
 }
 
 // Insertion Sort
 public static class Insertion
 {

  public static void insertionSort(int[] array)
  {
   int unsortedValue;
   int scan;
   int insertionCount=0; // for counting the number of comparisons of each insertion sort
   
   for(int index=1; index < array.length; index++)
   {
    unsortedValue = array[index];
    scan = index;
    
    while(scan > 0 && array[scan-1] > unsortedValue)
    {
     array[scan] = array[scan-1];
     scan--;
     
     // where the comparisons are occurred
     insertionCount++;
     sumInsertion++;
     
    }
    
    array[scan] = unsortedValue;
 
   }
 
   System.out.println("\nThe number of the comparisons(Insertion Sort): " + insertionCount); // print the number of comparisons of insertion sort
   
  }
 }
 
 // Quick Sort
 public static class Quick
 {
  static int quickCount; // for counting the number of comparisons of each quick sort
  
  public static void quickSort(int array[])
  {
   quickCount = 0; // every time, reset the quickCount, if not, it becomes cumulative
   doQuickSort(array, 0, array.length-1);
   System.out.println("\nThe number of the comparisons(Quick Sort): " + quickCount);
   
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
    sumQuick++;
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