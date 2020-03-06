//Assignment7 -- this file serves as Davis Dean's submission for Assignment 7
//CSIS 312-B02
//Citations
//No External Citations

public class Pair<F, S>
{
    //instance variables
    private F first;
    private S second;
    //constructor
    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }
    // First Setter / Getter
    public F getFirst()
    {
        return first;
    }
    public void setFirst(F first)
    {
        this.first = first;
    }
    // Second Setter / Getter
    public S getSecond()
    {
        return second;
    }
    public void setSecond(S second)
    {
        this.second = second;
    }
}
