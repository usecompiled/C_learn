package bytecode;
import java.io.*;

public class StudentReader {
	
	public static void main(String args[]) {
		Student stu = null;
		try {
			FileInputStream fi = new FileInputStream("stu.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			stu = (Student) ois.readObject();
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Name:	" + stu.getName());
		System.out.println("Age:	" + stu.getAge());
		System.out.println("Date:	" + stu.getDate());
	}//end of main()
	
}//end of class			