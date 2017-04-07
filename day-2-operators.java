import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip;
        double tax;
        double finalCost;
        
        tip = tipPercent * mealCost / 100;
        tax = taxPercent * mealCost / 100;
        finalCost = mealCost + tip + tax;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(finalCost);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
