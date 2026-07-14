// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
    String s ="chatushva immidisetti";
    System.out.println(s.length());
    System.out.println(s.contains("va"));
    System.out.println(s.substring(0));
    System.out.println(s.substring(1,6));
    
    System.out.println(s.charAt(5));
    System.out.println(s.startsWith("cha"));
    System.out.println(s.endsWith("tti"));
    for(int i=0;i<s.length();i++)
    {
        System.out.println(s.charAt(i));
    }
    for(char ch:s.toCharArray())
    {
        System.out.println(ch);
    }
    System.out.println(s.toUpperCase());
     System.out.println(s.toLowerCase());
     String st="  maya is good girl  ";
      System.out.println(st.length());
      System.out.println(st.trim());
       System.out.println(s.indexOf("a"));
   
    
    
    }
}
