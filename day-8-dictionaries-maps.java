import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String name = in.next();
            String phone = in.next();
            phoneBook.put(name, phone); 
        }
        while(true) {
          String s = in.next();
          if(s == null) {
            break;
          } else if (phoneBook.get(s) != null) {
              String a=new StringBuilder(s).append("=").append(phoneBook.get(s)).toString();
              System.out.println(a);
          } else {
              System.out.println("Not found");
          }
        }
        in.close();
    }
}
