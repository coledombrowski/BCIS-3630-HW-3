// Cole Dombrowski - BCIS 3630.2
// Java 3, part C
// Customer Complaint Log

import javax.swing.JOptionPane ;
public class ColeDombroPartC
{
   public static void main(String[] args)
   {
      // Variables
      
      int amount ;
      amount = 0 ;
      
      String productName ;
      String date ;
      String complaint ;
      String answer ;
      
      System.out.printf("%-10s %-14s %-40s\n", "Product", "Date", "Complaint") ;
      System.out.printf("------------------------------------\n") ;
      
      do
      {
         productName = JOptionPane.showInputDialog(null, "Enter the name of the product:") ;
      
         date = JOptionPane.showInputDialog(null, "Enter the date" +
                                    "\nUse the following format:" +
                                    "\nXX/XX/XXXX") ;
      
         complaint = JOptionPane.showInputDialog(null, "Enter the complaint:") ;
      
         System.out.printf("%-10s%-14s%-40s\n", productName, date, complaint) ;
         amount++ ;
      
         answer = JOptionPane.showInputDialog(null, "Are there any more complaints to log?" +
                                       "\nPlease enter Y for yes or N for no") ;
      }
      while (answer.equalsIgnoreCase("Y")) ;
      
         // Displays the amount of complaints received as a string
         System.out.print("\nThere were " + amount + " complaints logged.") ;
          
      // End of loop
    System.exit(0) ; 
   
   }
}