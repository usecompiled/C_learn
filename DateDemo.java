package bytecode;
import java.util.Date;
import java.text.SimpleDateFormat;

class DateDemo {
	public static void main(String[] args){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf.format(date));
	}
}