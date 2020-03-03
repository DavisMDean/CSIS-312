//Assignment6 -- this file serves as Davis Dean's submission for Assignment 6
//CSIS 312-B02
//Citations
//No External Citations

import java.util.Random;

public class RecursiveFunction {
    public static void main(String[] args)
    {
        System.out.println("Davis Dean - Assignment 6\n");
        // initiating array
        int[] intArray = new int[100];
        Random rand = new Random();
        // for loop to fill array with random integers 1-100
        for (int x = 0; x < intArray.length; x++)
        {
            intArray[x] = rand.nextInt(intArray.length);
        }
        printArray(intArray, intArray.length - 1); // calls printArray method
    }
    // method that prints the array recursively
    public static void printArray(int[] intArray, int index)
    {
        if (intArray == null) {
            System.out.println("Array is Empty");
        }
        else
        {
            if (index != -1)
            {
                printArray(intArray, index -1);
                System.out.print(intArray[index] + " ");
            }
        }
    }
}
