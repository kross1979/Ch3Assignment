
import javax.swing.JOptionPane;

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
    public static void main(String[] args) {
        String purchasePrice = JOptionPane.showInputDialog("Please enter your purchase price:");
        JOptionPane.showMessageDialog(null, purchasePrice\n + "Your state sales tax is " + purchasePrice*stateTax\n +
                "Your city tax is " + purchasePrice*cityTax\n);
        float stateTax = 0.04F;
        float cityTax = 0.02F;
    }
   
}
