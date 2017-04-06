import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) { 
           int a=sc.nextInt();
           int b=sc.nextInt();
           int N=sc.nextInt();
            
           for (int j = 0; j < N; j++) {
               int finalAns = a;
               int c = j;
               while (c >= 0) {
                  finalAns += (Math.pow(2, c)*b);
                  c--; 
               }
               System.out.print(finalAns+" ");
           }
           System.out.println("");
        }     
    }  
}
