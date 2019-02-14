// Name: Gyuchan Hwang
// Student ID: 001336372

import java.util.Scanner; // Needed for Scanner class
import java.io.*; // Needed for File I/O classes

public class Module6Assignment extends BinarySearchTree {
 
 static String name;
  
 public static void main(String[] args) throws IOException {
  
  // Create a Scanner object for keyboard input.
  Scanner keyboard = new Scanner(System.in);

  // Get the filename.
  System.out.print("Please enter the path and name for the input file: ");
     String filename = keyboard.nextLine();
  System.out.println("Using the file " + filename + " for input.");
    
  // Open the file.
  File file = new File(filename);
  Scanner inputFile = new Scanner(file);
  
  BinarySearchTree bst = new BinarySearchTree();
  Node bstree = null;

  // Read lines from the file until no more are left.
  while(inputFile.hasNext())
  {
    // Read lines and split them as a string and integer value
    String str = inputFile.next();
    int n = inputFile.nextInt();
    
    bst.add(str, n, bstree);
  }
  
  
    System.out.print("The name you want to check: ");
    name = keyboard.nextLine();
    
    while(!(name.equals("Exit")) && !(name.equals("exit")))
    {
      try {
        bst.contains(name, bstree);
      } catch (Exception e) {
        e.printStackTrace();
      }  
      System.out.print("The name you want to check: ");
      name = keyboard.nextLine();
      
    } 
    
    System.out.println("Exit");

    
      
  
  inputFile.close();
  
  
 }

}