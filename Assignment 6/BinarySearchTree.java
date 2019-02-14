public class BinarySearchTree
{
  public static Node root;
  static int numOfNode;
  
  BinarySearchTree()
  {
    root = null;
  }
  
  class Node
  {
    String name;
    int value;
    Node left, right;
    Node(String str, int val)
    {
      name = str;
      value = val;
      left = null;
      right = null;
    }
    Node(String str, int val, Node leftChild, Node rightChild)
    {
      name = str;
      value = val;
      left = leftChild;
      right = rightChild;
    }
  }
  
  public boolean contains(String str, Node bstree) throws Exception
  {
    numOfNode = 0; // Reset everytime
    
    bstree = root;
    if(bstree == null)
    {
      System.out.println("The name did not occur.");
      System.out.println("The number of nodes it had to visit: " + numOfNode);
      return false;
    }
    if(str.equals(bstree.name))
    {
      
      System.out.println("The name " + str + " is occured " + bstree.value + " times.");
      System.out.println("The number of nodes it had to visit: " + numOfNode);
      return true;
    }
    if((int)str.charAt(0) < (int)bstree.name.charAt(0))
    {
      // Traversing the nodes
      numOfNode++;
      return contains(str, bstree.left);
    }
    else
    {
      // Traversing the nodes
      numOfNode++;
      return contains(str, bstree.right);
    }
    
  }
  
  public Node add(String str, int val, Node bstree)
  {
    bstree = root;
    if(root == null)
      return new Node(str, val);
    if((int)str.charAt(0) < (int)bstree.name.charAt(0))
    {
      bstree.left = add(str, val, bstree.left);
    }
    else
    {
      bstree.right = add(str, val, bstree.right);
    }
    return bstree;
  }
  
  
  
  
}