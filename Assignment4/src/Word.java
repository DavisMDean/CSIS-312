//Assignment4 -- this file serves as Davis Dean's submission for Assignment 4
//CSIS 312-B02
//Citations
//No External Citations

import java.util.Random;

public class Word
{
    // Declaring and assigning values to arrays
    private static String[] article = {"the","a", "one", "some", "any"};
    private static String[] noun = {"boy","girl", "dog", "town", "car"};
    private static String[] verb = {"drove","jumped", "ran", "walked", "skipped"};
    private static String[] preposition = {"to","from", "over", "under", "on"};
    // StringBuilder getSentence Class
    // Using class random + string builder, chooses random value from array and creates sentence
    public static StringBuilder getSentence()
    {
        Random rand = new Random();
        StringBuilder sentence = new StringBuilder();
        sentence.append(article[rand.nextInt(article.length)]).append(" ");
        sentence.append(noun[rand.nextInt(noun.length)]).append(" ");
        sentence.append(verb[rand.nextInt(verb.length)]).append(" ");
        sentence.append(preposition[rand.nextInt(preposition.length)]).append(" ");
        sentence.append(article[rand.nextInt(article.length)]).append(" ");
        sentence.append(noun[rand.nextInt(noun.length)]).append(".");
        sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0))); // capitalizes first letter
        return sentence; // returns completed sentence to caller
    }
}