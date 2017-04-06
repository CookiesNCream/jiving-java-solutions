import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
          int C = 0;
          long N = sc.nextLong();

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
              C++;
              break;
            }
        }
            
        if (N == 1 || C != 0) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
              
        }
    }
}
