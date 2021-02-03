
package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;




public class MortgageCalculator {

   
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int principal;
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        while (true){
            System.out.print("Principal: ");
            principal = input.nextInt();
            if (principal >=1000 && principal <=1_000_000)
                break;
            System.out.println("enter a value between 1000 and 1 000 000");
        }
        

        System.out.print("Annual interest rate: ");
        float annualInterestRate = input.nextFloat();
        float monthlyInterest = (annualInterestRate/PERCENT)/MONTHS_IN_YEAR;
        
        System.out.print("Period (Years): ");
        int years = input.nextInt();
        int numberOfPayment = years * MONTHS_IN_YEAR;
        
        double mortage = principal * monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayment )/(Math.pow(1+monthlyInterest, numberOfPayment)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortgage: " + mortgageFormatted);
        
        
        
       
        
        
      
    }
    
}
