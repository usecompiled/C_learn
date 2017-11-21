package bytecode;
import java.util.*;

class Ex2 {
	
     public static void main(String[] args){
          String[] names = {"Mike", "Rose", "Mike", "Jhon", "Rose"};
          
          Map board = new HashMap();
          for (String nm : names) {
          	Integer num = (Integer)board.get(nm);
          	if (num == null) {
          		board.put(nm, 1);
          	} else {
          		board.put(nm, num+1);
          	}
          }
          
          System.out.println(board);
     }
     
}