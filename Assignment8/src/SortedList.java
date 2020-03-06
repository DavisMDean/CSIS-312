// Based on Fig. 21.3: List.java modified by Prof Terri Sipantzi of Liberty University
// ListNode and SortedList class declarations.

// class to represent one node in a list
class ListNode<T extends Comparable<T>>
{
   // package access members; SortedList can access these directly
   T data; // data for this node
   ListNode<T> nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode(T object) 
   { 
      this(object, null); 
   }  

   // constructor creates ListNode that refers to the specified
   // object and to the next ListNode
   ListNode(T object, ListNode<T> node)
   {
      data = object;    
      nextNode = node;  
   } 

   // return reference to data in node
   T getData() 
   { 
      return data; 
   } 

   // return reference to next node in list
   ListNode<T> getNext() 
   { 
      return nextNode; 
   } 
} // end class ListNode<T>

// class SortedList definition
public class SortedList<T extends Comparable<T>>
{
   private ListNode<T> firstNode;
   private ListNode<T> lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty SortedList with "list" as the name
   public SortedList() 
   { 
      this("list"); 
   } 

   // constructor creates an empty SortedList with a name
   public SortedList(String listName)
   {
      name = listName;
      firstNode = lastNode = null;
   } 
   
   // insert "insertItem" into the proper position within the sorted list
   public void insertSorted(T insertItem)
   {
       // Complete insertSorted() so that insertItem is added to the list
	   // in sorted order.  Use the compareTo() method (part of the interface
	   // Comparable) to do lesser/greater than comparisons of type T objects.
	   // See Section 20.4 and Fig 21.15 for more information on compareTo and 
	   // Examples of its use.
	   
	   // Use insertAtFront(), insertAtBack(), and insert() as necessary to 
	   // place insertItem in its proper place in the list.
	   
	   // Do not change any of the class signatures nor any of the methods in
	   // this file.
	   
	   // You may delete these comments, but be sure you follow the guidance
	   // provided.
   }
   
   private void insert(T insertItem, ListNode<T> previousNode)
   {
       previousNode.nextNode = new ListNode(insertItem, previousNode.nextNode);
   }
   
   // insert item at front of SortedList
   private void insertAtFront(T insertItem)
   {
      if (isEmpty()) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode<T>(insertItem);
      else // firstNode refers to new node
         firstNode = new ListNode<T>(insertItem, firstNode);
   } 

   // insert item at end of SortedList
   private void insertAtBack(T insertItem)
   {
      if (isEmpty()) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode<T>(insertItem);
      else // lastNode's nextNode refers to new node
         lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
   } 

   // remove first node from SortedList
   public T removeFromFront() throws EmptyListException
   {
      if (isEmpty()) // throw exception if SortedList is empty
         throw new EmptyListException(name);

      T removedItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode 
      if (firstNode == lastNode)
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from SortedList
   public T removeFromBack() throws EmptyListException
   {
      if (isEmpty()) // throw exception if SortedList is empty
         throw new EmptyListException(name);

      T removedItem = lastNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if (firstNode == lastNode)
         firstNode = lastNode = null;
      else // locate new last node
      { 
         ListNode<T> current = firstNode;

         // loop while current node does not refer to lastNode
         while (current.nextNode != lastNode)
            current = current.nextNode;
   
         lastNode = current; // current is new lastNode
         current.nextNode = null;
      } 

      return removedItem; // return removed node data
   } 

   // determine whether list is empty
   public boolean isEmpty()
   { 
      return firstNode == null; // return true if list is empty
   } 

   // output list contents
   public void print()
   {
      if (isEmpty()) 
      {
         System.out.printf("Empty %s%n", name);
         return;
      }

      System.out.printf("The %s is: ", name);
      ListNode<T> current = firstNode;

      // while not at end of list, output current node's data
      while (current != null) 
      {
         System.out.printf("%s ", current.data);
         current = current.nextNode;
      }

      System.out.println();
   } 
} // end class SortedList<T>

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
