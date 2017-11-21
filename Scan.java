package bytecode;
import java.io.*;

class Scan {
	static int n = 0;	
	public static void main(String[] args) {
		File dir = new File(".");
		compute(dir);
		System.out.println(n+" files found!");
	}
	
	static void compute(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getPath());
					n++;					
				} else {
					compute(f);
				}
			}
		}		
	}

}