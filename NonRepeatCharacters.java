package StringProgram;

import java.util.HashMap;

public class NonRepeatCharacters {

  public static void main(String[] args) {
    System.out.println("Problem 2");
    System.out.println("Finding the first non-repeated character.");
    System.out.println();
    
       String str = "aagcdefccb";
       HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        
       int lengthOfString = str.length();
       
       for(int i=0;i<lengthOfString;i++) {
         Character currentCharacter = str.charAt(i);
         if(hmap.containsKey(currentCharacter)==false) {
           hmap.put(currentCharacter,1);
         }else {
           int currentFreq = hmap.get(currentCharacter);
           currentFreq++;
           hmap.put(currentCharacter,currentFreq);
         }
       }
       
       boolean noRepeatingFound = false;
       for(int i=0;i<lengthOfString;i++){
         
         Character currentCharacter = str.charAt(i);
         int currentFreq = hmap.get(currentCharacter);
         if(currentFreq == 1){
           System.out.println(currentCharacter);
           break;
         }
       }
       
       if(noRepeatingFound == false){
         
         System.out.println(-1);
       }
  }
}
