//Assignment2 -- this file serves as Davis Dean's submission for Assignment 2
//CSIS 312-B02
//Citations
//No external Citations

public class Employee {
    public String firstName;                              
    public String lastName;                               
    public String socialSecurityNumber;                   
    
    // return first name
    public String getFirstName()
    {
       return firstName;
    }

    // return last name
    public String getLastName()
    {
       return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber()
    {
       return socialSecurityNumber;
    } 

    // return String representation of CommissionEmployee object
    @Override 
    public String toString()
    {
       return String.format("%s: %s %s%n%s: ", 
          "commission employee", getFirstName(), getLastName(), 
          "social security number", getSocialSecurityNumber());
    }
}
