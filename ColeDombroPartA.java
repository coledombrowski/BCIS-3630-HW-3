// Cole Dombrowski - BCIS 3630.2
// Java 3, part A
// Lawn Company Payroll

import java.util.Scanner ;
public class ColeDombroPartA
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // Variables
      
      int employeeNumber ;
      double grossPay ;
      double stateTax ;
      double federalTax ;
      double ficaWith ;
      double netAmount ;
      
      // This displays "$0" for all values if the initial value is
      // false, this is because no one is being paid.
      
      grossPay = 0 ;
      stateTax = 0 ;
      federalTax = 0 ;
      ficaWith = 0 ;
      netAmount = 0  ;
       
      do
      {
         // Get employee number
         System.out.println("What is your employee number?" +
                        "\nIf there is no employee left to input, please enter 0") ;
         employeeNumber = input.nextInt();
         
         
         // Executes if the input value (employee number) is not "0"
         // In other words, the sentinel is "0"
         
         if (employeeNumber != 0)
            {
               System.out.println("What is your gross pay?") ;
               grossPay = input.nextDouble();
         
               System.out.println("What are your state tax withholdings?") ;
               stateTax = input.nextDouble();
         
               System.out.println("What are your federal tax withholdings?") ;
               federalTax = input.nextDouble();
         
               System.out.println("What is your FICA withholding?") ;
               ficaWith = input.nextDouble();
         
               // Initializes net amount as variable
               netAmount = (grossPay - stateTax - federalTax - ficaWith) ;
            }
         }      
      while (employeeNumber != 0) ;
      
         System.out.println("Here are your reported employee earnings:" +
                        "\n   " + // Blank line
                        "\nGross =      " + "$ " + String.format("%.2f", grossPay) +
                        "\nState Tax =  " + "$ " + String.format("%.2f", stateTax) +
                        "\nFed Tax =    " + "$ " + String.format("%.2f", federalTax) +
                        "\nFICA Tax =   " + "$ " + String.format("%.2f", ficaWith) +
                        "\nNet Amount = " + "$ " + String.format("%.2f", netAmount)) ;       
   }
}