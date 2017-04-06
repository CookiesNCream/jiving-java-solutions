import java.util.*;
import java.io.*;

class Solution {
   public static void main(String []argh) {
      
      Scanner in = new Scanner(System.in);
      String s;
      int N=in.nextInt();
      Map<String,String> phoneBook = new HashMap<String,String>();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         String phone=in.nextLine();
         phoneBook.put(name,phone);
      }
      while(true) {
         s=in.nextLine();
         if(s==null) {
           break;
       } else if(phoneBook.get(s)!=null) {
           String a=new StringBuilder(s).append("=").append(phoneBook.get(s)).toString();
           System.out.println(a);
       } else {
           System.out.println("Not found");
       }
      }
   }
}

/**/

import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Map<String, String> phoneBook = new HashMap<String, String>();
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      in.nextLine();
      for (int i = 0; i < N; i++) {
         String name = in.nextLine();
         String phone = in.nextLine();
         phoneBook.put(name, phone); 
      }
      for (String s : phoneBook.keySet()) {
         s = in.nextLine(); 
         if (phoneBook.get(s) != null) {
             System.out.println(s + "=" + phoneBook.get(s));
         } else {
             System.out.println("Not found");
         } 
      }   
   }
}
