//Assignment5 -- this file serves as Davis Dean's submission for Assignment 5
//CSIS 312-B02
//Citations
//No External Citations

import java.util.*;

public class JavaLinkedList {
    public static void main(String[] args)
    {
        System.out.println("Davis Dean - Assignment 4\n");
        // initializing array for all 100 numbers
        int[] intList = new int[100];
        // for loop to fill array with integers 1-100
        for (int x = 0; x < intList.length; x++)
        {
            intList[x] = x + 1;
        }
        // creating class random
        Random rand = new Random();
        // creating Linked List and filling it with 25 random numbers using a for loop
        LinkedList<Integer> randVals = new LinkedList<Integer>();
        for (int i = 0; i < 25; i++){
            sortValues(randVals, intList[rand.nextInt(intList.length)]);
            //sortValues method called so the LinkedList is sorted numerically
        }
        // calling the three methods created to print, sum, and average the numbers
        printList(randVals);
        sumList(randVals);
        averageList(randVals);
    }
    //printList method prints the random numbers
    private static void printList(LinkedList<Integer> linkedList)
    {
        System.out.println("Random 25 Numbers Selected Between 1-100: ");
        Iterator<Integer> i= linkedList.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
        System.out.println("==========================="); // to separate fields
    }
    // sumList method uses a while loop to find and sum each number and prints sum
    public static void sumList(LinkedList<Integer> linkedList)
    {
        Iterator<Integer> i= linkedList.iterator();
        int sum = 0;
        while(i.hasNext())
        {
            sum = sum + i.next();
        }
        System.out.println("Sum of Elements: " + sum);
        System.out.println("===========================");
    }
    // averageList uses a while loop and devies the sum by 25 to return the average
    public static void averageList(LinkedList<Integer> linkedList)
    {
        Iterator<Integer> i= linkedList.iterator();
        int sum = 0;
        while(i.hasNext())
        {
            sum = sum + i.next();
        }
        double average = 0.00;
        average = sum / 25;
        System.out.println("Average of Elements: " + average);
        System.out.println("===========================");
    }
    // sortValues process the numbers and adds them to the list numerically sorted
    private static boolean sortValues(LinkedList<Integer> linkedList, Integer newValue)
    {
        ListIterator<Integer> integerListIterator = linkedList.listIterator();
        while(integerListIterator.hasNext())
        {
            int comparison = integerListIterator.next().compareTo(newValue);
            if(comparison > 0)
            {
                integerListIterator.previous();
                integerListIterator.add(newValue);
                return true;
            } else if(comparison < 0){}
        }
        integerListIterator.add(newValue);
        return true;
    }
}
