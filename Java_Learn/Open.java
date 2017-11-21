package bytecode;
import java.io.*;

class Open {
	
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("zh.txt");
			
		int c = 0;
		while ((c = in.read()) != -1) {
			System.out.print((char)c);
		}
		
		in.close();
	}
	
}