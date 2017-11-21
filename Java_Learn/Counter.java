package bytecode;
import java.util.*;
import java.io.*;

class Counter {
	
	public static void main(String[] args) throws Exception {
		List<String> words = split(new File("data.txt"));

		for (String w : words) {
			System.out.println(w);
		}
		System.out.println(words.size());

		//计算不同的单词个数
		Set set = new HashSet();
        for (String w : words) {
            set.add(w);
        }
        System.out.println(set.size() + " 个不同的单词：");
	}	
	
	/*
	* 对英文文本进行切词
	*/
	static List split(File src) throws Exception {
		Scanner in = new Scanner(src);
		List<String> result = new ArrayList<String>();
		while (in.hasNext()) {
			String token = in.next(); //去掉空白
			String[] parts = token.split("\\p{Punct}");//去掉标点符号
			for (String part : parts) {
				result.add(part.toLowerCase()); //全部小写				
			}
		}
		return result;
	}
}