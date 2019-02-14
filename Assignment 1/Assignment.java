// Name: Gyuchan Hwang
// Student ID: 001336372

import java.util.Scanner; // Needed for the scanner class

public class Assignment {

 public static void main(String[] args) {
  
  // Create a Scanner object for keyboard input.
  Scanner scanner = new Scanner(System.in);
  
  // Get the string from the user.
  System.out.print("Enter the string to reverse, or 'done' to exit: ");
  String input = scanner.nextLine();
  
  // call the recursive method and loop for the next word
  // if the user enter "done", the loop would be stopped
  while(!input.equals("done")) {
   String result = reverse(input);
   System.out.println(result);
   
   System.out.print("Enter the string to reverse, or 'done' to exit: ");
   input = scanner.nextLine();
  }
  
  // Exit when the user enter "done"
  System.out.println("Exit");
  
 }
 
 // recursive method
 private static String reverse(String input) {
  if(input.length()<2) {
   // base case (0 or 1 character of the word, so it does not matter whether the word is odd or even)
   return input;
  } else {
   // recursive step, the last character of the word goes to beginning point and erase the last character of the word
   return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
  }
  
 }
 
}