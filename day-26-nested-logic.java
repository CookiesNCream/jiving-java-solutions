import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actRetD = sc.nextInt();
        int actRetM = sc.nextInt();
        int actRetY = sc.nextInt();
        int expRetD = sc.nextInt();
        int expRetM = sc.nextInt();
        int expRetY = sc.nextInt();
        int fine = 0;
        if (actRetD <= expRetD) {
            System.out.println(fine);
        } else if (actRetM == expRetM) {
            fine = 15 * (actRetD - expRetD);
            System.out.println(fine);
        } else if (actRetY == expRetY) {
            fine = 500 * (actRetM - expRetM);
            System.out.println(fine);
        } else {
            fine = 10000;
            System.out.println(fine);
        }  
    }
}
