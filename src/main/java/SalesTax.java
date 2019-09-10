
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class SalesTax {
    public static void main(String[] args) 
        {
            Scanner user  = new Scanner(System.in); 
            System.out.println("What is your purchase price?");
            double purchasePrice = user.nextDouble(); 
        
            double stateTaxRate = 0.04;
            double cityTaxRate = 0.02;
            double stateTax = purchasePrice * stateTaxRate;
            double cityTax = purchasePrice * cityTaxRate;
                        
            System.out.println("Your purchase price is $" + purchasePrice);
            System.out.println("Your state tax is $" + stateTax);
            System.out.println("Your city tax is $" + cityTax);
            System.out.println("Your total tax is $" + (stateTax + cityTax));
            System.out.println("Your grand total including tax is $" + (purchasePrice + stateTax + cityTax));
        }
    }
