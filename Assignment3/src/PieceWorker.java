//Assignment3 -- this file serves as Davis Dean's submission for Assignment 3
//CSIS 312-B02
//Citations
//No External Citations

public class PieceWorker extends Employee
{
    private int wage;
    private int pieces;
    // constructor
    public PieceWorker(String firstName, String lastName, 
       String socialSecurityNumber, int wage, int pieces)
    {
       super(firstName, lastName, socialSecurityNumber); 

       if (wage < 0.0)
          throw new IllegalArgumentException(
             "Wage must be >= 0.0");
       if (pieces < 0.0)
          throw new IllegalArgumentException(
             "Pieces must be >= 0.0");
       this.wage = wage;
       this.pieces = pieces;
    }   
    // set wage
    public void setWage(int wage)
    {
       if (wage < 0.0)
          throw new IllegalArgumentException(
             "Wage must be >= 0.0");

       this.wage = wage;
    }    
    // return wage
    public double getWage()
    {
       return wage;
    }     
    // set pieces
    public void setPieces(int pieces)
    {
       if (pieces < 0.0)
          throw new IllegalArgumentException(
             "Pieces must be >= 0.0");

       this.pieces = pieces;
    }     
    // return pieces
    public double getPieces()
    {
       return pieces;
    } 
    // calculate earnings; override abstract method earnings in Employee
    @Override                                                           
    public double earnings()                                            
    {                                                                   
       return getWage() * getPieces();                                        
    }                                             
   // override
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s: %s%n%s: $%,.2f; %s: %,.2f ", "Piece Worker", 
              super.toString(), "Wage Per Piece", getWage(), "Pieces", getPieces());                             
   } 
}
