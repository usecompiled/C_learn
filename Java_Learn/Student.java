package bytecode;
import java.io.*;
import java.util.Date;

public class Student implements Serializable{
	private String name;
	private int age;
	private Date date;
	
	public Student(String name,int age,Date date) {
		this.name = name;
		this.age = age;
		this.date = date;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Date getDate() {
		return this.date;
	}

}