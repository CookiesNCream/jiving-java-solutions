import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {
    
    
     
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tip;
      double tax;
      double finalPrice;
        
      tip = T*M/100;
      tax = X*M/100;
      finalPrice = M + tip + tax;  
      
      int total = (int) Math.round(finalPrice);
      
      System.out.println("The final price of the meal is $" + total + ".");
      
    }
}
