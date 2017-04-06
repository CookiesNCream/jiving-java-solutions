import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int space;
        int symbol = 1;
        int s = n - 1;
        for (int i = 0; i < n; i++) {
            space = s;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < symbol; k++) {
                System.out.print("#");
            }
            System.out.println("");
            s--;
            symbol++;
        }
    }
}
