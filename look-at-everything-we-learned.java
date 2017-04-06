import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String output = new String("Funny");
        Scanner sc = new Scanner(System.in);
        int C = 0;
        int T = Integer.parseInt(sc.nextLine());
        while (T > 0) {
           String S = sc.nextLine();
           StringBuffer R = new StringBuffer(S);
           R.reverse();
           for (int i = 0; i < S.length() - 1; i++) {
           C = 0;
           int x = Math.abs((int) S.charAt(i+1) - (int) S.charAt(i));
           int y = Math.abs((int) R.charAt(i+1) - (int) R.charAt(i));

           if (x != y) {
               System.out.println("Not Funny");
               break;
           } else {
               C++; 
           }
               
           }
           if (C > 0) 
              System.out.println("Funny");
              T--;   
        }
    }
}

/**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       int C = 0;
       int T = Integer.parseInt(in.nextLine()); 
       while (T > 0) {
           String S = in.nextLine();
           StringBuffer R = new StringBuffer(S);
           R.reverse();
           for (int i = 0; i < S.length() - 1; i++) {
               C = 0;
               int x = Math.abs((int) S.charAt(i+1) - (int) S.charAt(i));
               int y = Math.abs((int) R.charAt(i+1) - (int) R.charAt(i));
               if (x != y) {
                  System.out.println("Not Funny");
                  break;
               } else {
                   C++;
               }
           }
           if (C > 0) 
               System.out.println("Funny");
               T--;          
       }
   } 
}
