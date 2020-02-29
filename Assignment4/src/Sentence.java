//Assignment4 -- this file serves as Davis Dean's submission for Assignment 4
//CSIS 312-B02
//Citations
//No External Citations

public class Sentence
{
    public static void main(String[] args)
    {
        System.out.println("Davis Dean - Assignment 4\n");
        // for loop used to generate 20 sentences
        for (int x = 0; x < 20; x++)
        {
            // calling getSentence from Word to print sentences
            Word object = new Word();
            System.out.printf("Sentence %s%s%s%n", x + 1, ": ", object.getSentence());
        }
    }
}
