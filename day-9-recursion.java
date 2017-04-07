import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int factorial(int N) {
        if (N > 1) {
            return N * factorial(N - 1);
        } else {
            return N;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = factorial(N);
        System.out.println(result);
    }
}
