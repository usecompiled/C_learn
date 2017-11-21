package bytecode;
import java.io.*;

class FileDemo {
	
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/java/api","/IO");
		String[] names = dir.list();
		for (String s : names) {
			System.out.println(s);
		}
	}
	
}