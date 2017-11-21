package bytecode;
import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i=1;i<55;i++) {
            list.add("c"+i);
        }
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }
}