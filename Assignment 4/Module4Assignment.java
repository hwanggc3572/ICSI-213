// Name: Gyuchan Hwang
// Student ID: 001336372

import java.util.Scanner; // Needed for the Scanner class
import java.io.*; // Needed for the File and IOException

public class Module4Assignment
{
  // To prevent the second initialize
  static int initialCount = 0;
  
  public static void main(String[] args) throws IOException
  {
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Textbook chap 4
    // Get the filename.
    System.out.print("Please enter the path and name for the input file:  ");
    String filename = keyboard.nextLine();
    System.out.println("Using the file m4input2.dat for input.");
    
    // Open the file.
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);
    
    // Make a constructor
    LinkedList list = new LinkedList();
    
    // Read lines from the file until no more are left.
    while (inputFile.hasNext())
    {
      // Read lines and split them as a char value and integer value
      String str = inputFile.next();
      char c = str.charAt(0);
      int n = inputFile.nextInt();
      
      // Use if statements for every case of char value.
     
        if (c == 'I')
        {
          // prevent the second initialize
          initialCount++;
          if(initialCount > 1)
          {
            System.exit(0);
          }
          // initialize the linkedlist
          list = new LinkedList();
          System.out.println("Processing I\n\tThe list has been initialized.");
        }
        if (c == 'B')
        {
          list.addBeginning(n);
        }
        if (c == 'C')
        {
          list.addEnd(n);
        }
        if (c == 'R')
        {
          try{
          list.removeBeginning();
        } catch(Exception e) {}
        }
        if (c == 'S')
        {  
          try{
          list.removeEnd();
        } catch(Exception e) {}
        }
        if (c == 'T')
          list.traverse();
        if (c == 'X')
        {
          list.exit();
          // Exit the program
          break;
        }
      }
      
    
    // Close the file.
    inputFile.close();
    
  }
}




 
 
 
 

