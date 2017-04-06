import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int arr[][] = new int[10][10];
        int larSum = -36985247;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j+2 < n && i+2 < n ){  
                   int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                   if(sum > larSum)larSum = sum;
                }
            }
        }
        System.out.println(larSum);
    }
}
