public class LinkedList {
 
 private class Node
 {
  int value;
  Node next;
  Node prev;
  
  Node (int val, Node n, Node p)
  {
   value = val;
   next = n;
   prev = p;
  }
  
  Node (int val)
  {
   this(val,null,null);
  }
 }
 
 private Node first;
 private Node last;
 private Node temp;
 
 public LinkedList()
 {
   first = null;
   last = null;
 }
 
 // check the linked list is empty or not
 public boolean isEmpty()
 {
  return first == null;
 }
 
 // return the size of the linked list
 public int size()
 {
  int count = 0;
  Node p = first;
  while (p != null)
  {
   count++;
   p = p.next;
  }
  return count;
 }
 
 public void addBeginning(int n)
 {
  if (isEmpty())
  {
   first = new Node(n);
   last = first;
  }
  else
  {
   // make new node and put n into first node
   temp = new Node(n, first, null);
   first.prev = temp;
   first = temp;
  }
  System.out.println("Processing B\n\tAdded the value " + n + " to a node at the beggining of the list.");
 }
 
 public void addEnd(int n)
 {
  if (isEmpty())
  {
   first = new Node(n);
   last = first;
  }
  else
  {
   // make new node and put n into last node
   last.next = new Node(n, null, last);
   last = last.next;
  }
  System.out.println("Processing C\n\tAdded the value " + n + " to a node at the end of the list.");
 }
 
 // Textbook chap 11 - Exception
 public void removeBeginning() throws Exception
 {
  // report an error and exit if the list is empty
  if(isEmpty())
  {
   throw new Exception();
  }
  else
  {
   // remove the first node and the value is saved in temp
   temp = first;
   first = first.next;
   first.prev = null;
  }
  System.out.println("Processing R\n\tRemoved the node with value " + temp.value  + " from the beggining of the list.");
 }
 
 public void removeEnd() throws Exception
 {
  // report an error and exit if the list is empty
  if(isEmpty())
  {
   throw new Exception();
  }
  else
  {
   // remove the last node and the value is saved in temp
   temp = last;
   last = last.prev;
   last.next = null;
  }
  System.out.println("Processing S\n\tRemoved the node with value "  + temp.value+ " from the end of the list.");
 }
 
 // Traverse the linked list and read the values
 public void traverse()
 {
   System.out.print("Processing T\n\tTraversing the list and it contains the following values: ");
   temp = first;
   while(temp != null)
   {
     System.out.print(temp.value + " ");
     temp = temp.next;
   }
   System.out.println();
   
 }
 
 public void exit()
 {
  System.out.println("Processing X\n\tExiting...");
 }
 

}