package stringProgram;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
   System.out.println("Problem 5");
   System.out.println("Checking whether two string are anagram.");
   System.out.println();
   
      String str1="study";
      String str2="dusty";
      
      str1=str1.toLowerCase(); //study
      str2=str2.toLowerCase(); //dusty

      System.out.println("str1 --" +str1);
      System.out.println("str2 --" +str2);
      System.out.println();
      
      if(str1.length()!=str2.length()) {
        System.out.println("Not anagram");
      }
      else {
        char[] string1=str1.toCharArray();
        char[] string2=str2.toCharArray();
        
        Arrays.sort(string1); //d s t u y
        Arrays.sort(string2); //d s t u y
        
        System.out.println("string 1 firstvalue =" +string1[0]);
        System.out.println("string 1 secondvalue =" +string1[1]);
        System.out.println("string 1 thirdvalue =" +string1[2]);
        System.out.println("string 1 fourvalue =" +string1[3]);
        System.out.println("string 1 fifthvalue =" +string1[4]);
        System.out.println();
        
        System.out.println("string 2 firstvalue =" +string2[0]);
        System.out.println("string 2 secondvalue =" +string2[1]);
        System.out.println("string 2 thirdvalue =" +string2[2]);
        System.out.println("string 2 fourvalue =" +string2[3]);
        System.out.println("string 2 fifthvalue =" +string2[4]);
        System.out.println();
        
        if(Arrays.equals(string1, string2)==true) {
          System.out.println("Both are anagram");
        }
        else {
          System.out.println("Not anagram");
        }
      }
  }
}
