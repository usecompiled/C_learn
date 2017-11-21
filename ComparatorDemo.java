package bytecode;
import java.util.*;

class ComparatorDemo { 

	public static void main(String[] args) {
		//测试数据
		List<Record> records = new ArrayList(); 
		records.add(new Record(5, "宋江", "95588123456", 8000));
		records.add(new Record(2, "晁盖", "95588123456", 7000));
		records.add(new Record(8, "武松", "95588523458", 5000));
		records.add(new Record(3, "杨志", "95588223456", 9000));
		//按编号排序
		Collections.sort(records, new C1());
		for (Record r : records) {
			System.out.println(r.sequence + "\t" + r.name + "\t" + r.salary);
		}
		//按薪水排序
		Collections.sort(records, new C2());
		for (Record r : records) {
			System.out.println(r.sequence + "\t" + r.name + "\t" + r.salary);
		}
	}
	
}

//工资记录
class Record {

	int sequence;
	String name;
	String account;
	double salary;
	
	Record(int se, String n, String a, double sa) {
		this.sequence = se;
		this.name = n;
		this.account = a;
		this.salary = sa;
	}
	
}

class C1 implements Comparator<Record> {
	
	public int compare(Record r1, Record r2) {
		return (r1.sequence - r2.sequence);
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
}

class C2 implements Comparator<Record> {
	
	public int compare(Record r1, Record r2) {
		return (int)(r1.salary - r2.salary);
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
}