//Assignment7 -- this file serves as Davis Dean's submission for Assignment 7
//CSIS 312-B02
//Citations
//No External Citations

public class PairTest
{
    public static void main(String[] args)
    {
        System.out.println("Davis Dean - Assignment 7\n");
        // creating objects both integer and string types
        Pair p1 = new Pair(42, "p1 Test");
        Pair p2 = new Pair(24, "p2 Test");
        // initial get test shows integer and string types being passed successfully
        // p1 test
        System.out.println("First test: get p1");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        System.out.println("=====================");
        // p2 test
        System.out.println("Second test: get p2");
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
        System.out.println("=====================");
        // test with setters showing proper type change and printing successful
        System.out.println("Third test: set p1");
        p1.setFirst("p1 set Test"); // changing p1 from integer to string in setFirst
        p1.setSecond(44); // changing p1 from string to integer in setFirst
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        System.out.println("=====================");
        // test with setters showing proper type change and printing successful
        System.out.println("Forth test: set p2");
        p2.setFirst("p2 set Test"); // changing p1 from integer to string in setFirst
        p2.setSecond(22); // changing p1 from string to integer in setFirst
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
        System.out.println("=====================");
    }

}
