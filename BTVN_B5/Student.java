package BTVN_B5;
import java.util.Scanner;

public class Student extends Person{
	private int id;
	private String nameClass;
	private float gpa;
	final float criteria = 2;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getCriteria() {
		return criteria;
	}
	public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
		super(name, age, address);
		this.id = id;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}
	public Student() {
		
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("NameClass: ");
		nameClass = sc.nextLine();
		System.out.print("Gpa: ");
		gpa = sc.nextFloat();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf("%-15d %-15s %-15.2f \n",id,nameClass,gpa);
	}
	
	public boolean checkFall() {
		boolean check = false;
		if(gpa < criteria) {
			check = true;
		}
		return check;
		
	}
	
	

}
