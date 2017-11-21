package bytecode;
import java.io.*;
import java.util.Date;

public class StudentWriter {
	
	public static void main(String args[]) {
		Student stu = new Student("Liu Ming", 23, new Date());
		try {
			FileOutputStream fo = new FileOutputStream("stu.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(stu);
			oos.close();
		} catch (Exception e) {
			//System.out.println(e);
		}
	}//end of main()
	
}//end of class			