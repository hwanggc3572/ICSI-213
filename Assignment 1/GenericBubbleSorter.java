public class GenericBubbleSorter {
   public static <E extends Comparable<E>> void bubbleSort (E[] array) {
     int lastPos;
     int index;
     E temp;
     for (lastPos = array.length -1; lastPos >= 0; lastPos--) {
       for (index = 0; index <= lastPos -1; index++) {
         if (array[index].compareTo(array[index + 1]) > 0) {
           temp = array[index];
           array[index] = array[index + 1];
           array[index + 1] = temp;
         }
       }
     }
   }
     public static void main(String[] args) { 
     
       Integer[] listArray = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
       Double[] doubleArray = {3.4, 1.3, -22.1, 14.8, 6.0, 2.3, 12.2};
       Character[] charArray = {'a', 'J', 'r' };
       String[] stringArray = {"Tom", "Susan", "Kim"};
       
       bubbleSort(listArray);
       bubbleSort(doubleArray);
       bubbleSort(charArray);
       bubbleSort(stringArray);
       
       printList(listArray);
       printList(charArray);
       printList(doubleArray);
       printList(stringArray);
     }
     
     public static void printList(Object[] List) {
       for(int i=0; i<List.length; i++) {
         System.out.print(List[i] + " ");
       }
       System.out.println( );
     }
 }