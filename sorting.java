import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(a);
        int diff = Integer.MAX_VALUE;
        for (int i = a.length - 1; i > 0; i--) {
            if(a[i] - a[i-1] < diff) {
                diff = a[i] - a[i-1];
            }
            
        }
            
        for (int i = 1; i < a.length - 1; i++) {
            if(a[i] - a[i-1] == diff) {
                System.out.print(a[i-1] + " " + a[i] + " ");
            }
        }     
    }
}
