package substr;

import java.util.HashSet;
import java.util.*;

public class Substr {
    
  public static int  getLength(String str) {
    int preInd = 0, currInd = 0, maxLength = 0;
    int strLength = str.length();
    HashSet<Character> characterSet = new HashSet<>();

    while (currInd < strLength) {
      if (characterSet.contains(str.charAt(currInd))) {
        characterSet.remove(str.charAt(preInd));
        preInd++;
      } 
      else {
        characterSet.add(str.charAt(currInd));
        currInd++;
        maxLength = Math.max(maxLength, currInd - preInd);
      }
    }
    return maxLength;
  }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string :");
        s=sc.next();
        System.out.println(getLength(s));
                
    }
}




