import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int countConsecutive = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count = 0;
            } else if (binary.charAt(i) == '1') {
                count++;
                if (count > countConsecutive) {
                    countConsecutive = count;
                }
            }
        }
        System.out.println(countConsecutive);
    }
}
