package Kthp;
import java.util.*;

public class Employee extends User{
	private int basic_salary;
	private String department;
	
	//Constructer
	public  Employee() {

	}
	public  Employee(String id, String name, String fullName, float cosalary, int basic_salary, String department) {
		super(id,name,fullName,cosalary);
		this.basic_salary = basic_salary;
		this.department = department;	
	}
	//getter
	public int getBasic_salary() {
		return basic_salary;
	}
	public String getDepartment() {
		return department;
	}
	//setter
	public void setBasic_salary(int basic_salary) {
		this.basic_salary = basic_salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+ "\tbasic_salary: " + basic_salary + "\tdepartment: " + department;
	}
	//display
	@Override
	public void display() {
		//super.display(); in ra 2 lần thông tin
		System.out.println(toString());
	}
	//nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Basic_salary: ");
		basic_salary = sc.nextInt();
		sc.nextLine();
		System.out.print("Department: ");
		department = sc.nextLine();
		sc.close();
	}
	//getsalary()
	@Override
	public float getSalary() {
		float phucap = 0;
		if(department.equals("Nhansu"))
			phucap = 1;
		else if(department.equals("Kinhdoanh"))
			phucap = 1.2f;
		else if(department.equals("Congnghe"))
			phucap = 1.15f;
		else if(department.equals("Quantri"))
			phucap = 1.2f;
		return getCosalary()*basic_salary*phucap;
	}
	
	
	
}
