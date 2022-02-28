package stringProgram;

public class RemovingWhiteSpaces {

  /**
   *remove all whitespaces from a string
   *@param args
   */

  public static void main(String[] args) {
  System.out.println("Problem 4");
  System.out.println("Removing white space from a string.");
  System.out.println();
   
    String newString = "**This is my activity 1 in programming 2 using java N-IDE   ";
    System.out.println(newString);
    String noWhiteSpacesString ="";
    for(int i=0; i<newString.length(); i++){
      
      if((newString.charAt(i)!=' ') && (newString.charAt(i)!='\t')) {
      noWhiteSpacesString = noWhiteSpacesString + newString.charAt(i);
        
      }
      
    }
    
    System.out.println(noWhiteSpacesString);
    
    
    
    //System.out.println(newString.trim());
    
    //System.out.println(newString.replaceAll("\\s+",""));
    
    
  }
}