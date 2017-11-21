package bytecode;
import java.util.Random;

public class RandomPW {

	public static void main(String[] args) {
		System.out.println(getPW(6));
	}
	
	static char[] options = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
	'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
	'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static String getPW(int pwd_len){		
		StringBuffer result = new StringBuffer();
		Random r = new Random();
		while(pwd_len>0){
			//随机生成下标值
			int index = r.nextInt(options.length);
			result.append(options[index]);
			pwd_len--;
		}
		return result.toString();
	}
}