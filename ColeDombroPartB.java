// Cole Dombrowski - BCIS 3630.2
// Java 3, part B
// Salary increase

import java.util.Scanner ;
public class ColeDombroPartB
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in) ;
      
      // Variables
      
      int year ;
      int yearsWorked ;
      double beginningSalary ;
      double percentIncrease ;
      double salaryIncrease ;
      double endSalary ;
      
      // Initial user questions
      System.out.print("How many years have you worked?\n") ;
      yearsWorked = input.nextInt() ;
      
      System.out.print("What is your beginning salary?\n") ;
      beginningSalary = input.nextDouble() ;
      
      System.out.print("What is your salary percentage increase?" +
                  "\nPlease enter in this format:" +
                  "\n   " + // Blank line
                  "\nFor 4%, enter: 4, for 12%, enter: 12\n") ;
      percentIncrease = input.nextDouble() ;
 
      // Labels of each value
       
      System.out.printf("Year  Beg Salary     Increase      End Salary") ;
      System.out.println("\n--------------------------------------------") ;
      
      // FOR LOOP BEGINNING
      
      for (year = 1; year <= yearsWorked; year++)
      {                  
         salaryIncrease = beginningSalary * (percentIncrease / 100) ;
         endSalary = salaryIncrease + beginningSalary ;
         
         System.out.printf("%-6d$%-15.2f$%-13.2f$%-13.2f\n", year, beginningSalary, salaryIncrease, endSalary) ; 
         
         // Updates "current salary"
         beginningSalary = endSalary ;
      }  
      
      // End of program/escape
      System.exit(0) ;   
   }
}      