import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String S = in.next();
            char[] myCharArray = S.toCharArray();
            String even = "";
            String odd = "";
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                   even = even + myCharArray[j]; 
                } else if (j % 2 == 1) {
                   odd = odd + myCharArray[j];
                }
            }
            System.out.print(even + " " + odd + "\n");
        }  
    }
}
