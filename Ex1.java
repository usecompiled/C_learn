package bytecode;
import java.util.*;

class Ex1 {
	
     public static void main(String[] args){
          String[] words = {"hello", "good", "java", "dog", "java"};
          
          Arrays.sort(words);
          Set temp = new HashSet();
          Set result = new HashSet();
          for (String word : words) {
          	if (!temp.add(word)) {
          		result.add(word);
          	}
          }
          System.out.println(result);
          System.out.println(words);
     }
     
}