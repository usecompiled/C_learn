package bytecode;
import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;

class ZipDemo {	
	static ArrayList javaFiles = new ArrayList();
	static void scan(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isFile() && f.getName().endsWith(".java")) {
					javaFiles.add(f);					
				} else {
					scan(f);
				}
			}
		}		
	}
	
	public static void main(String[] args) throws Exception {
		//扫描指定目录,  将找到的Java源文件存储到javaFiles列表中
		File dir = new File("D:/");
		scan(dir);
		
		//将javaFiles中所有文件压缩到src.zip
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("src.zip"));
		byte[] buffer = new byte[1024];
		int length = 0;
		int beginIndex = dir.getAbsolutePath().length()+1;
		for (Object ob : javaFiles) {
			File f = (File)ob;
			zipOut.putNextEntry(new ZipEntry(f.getAbsolutePath().substring(beginIndex)));
			FileInputStream in = new FileInputStream(f);
			while ((length = in.read(buffer)) != -1) {
				zipOut.write(buffer, 0, length);
			}
			in.close();
			zipOut.closeEntry();
		}
		
		zipOut.close();
	}
	
}