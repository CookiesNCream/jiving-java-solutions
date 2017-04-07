import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRegEx = ".+@gmail.com$";
        Pattern p = Pattern.compile(emailRegEx);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String firstName : list) {
           System.out.println(firstName); 
        }
    }
}
