import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      for (int i = 0; i < testCases; i++) { 
         try {
            String pattern = in.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(pattern);
            boolean b = m.matches();
            System.out.println("Valid");
         } catch (PatternSyntaxException e) {
             System.out.println("Invalid");
         } 
      }
   }
}
