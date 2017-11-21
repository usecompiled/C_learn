package bytecode;
import java.util.*;

public class GenericDemo {
	
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add(new User("Tom", 21));
        list.add(new User("Mike", 19));
        list.add(new User("John", 23));
        //list.add(new String("John"));
        
        for (Object ob : list) {
        	User u = (User)ob;
        	System.out.println(u.getName() + ": " + u.getAge());	
        }        
    }
    
}

class User {
	private String name;
	private int age;
	
	User(String s, int i) {
		this.name = s;
		this.age = i;
	}
	 
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
}