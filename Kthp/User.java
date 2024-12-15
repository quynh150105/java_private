package Kthp;
import java.util.*;

public abstract class User {
	protected String id;
	protected String name;
	protected String fullName;
	protected float cosalary;
	
	//constructer khong tham so
	public User() {
		
	}
	//constructer du tham so
	public User(String id, String name, String fullName, float cosalary) {
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.cosalary = cosalary;
	}
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public float getCosalary() {
		return cosalary;
	}
	public void setCosalary(float cosalary) {
		this.cosalary = cosalary;
	}
	//toString
	@Override
	public String toString() {
		return "id:" + id +"\tname: " + name + "\tfullName: " + fullName + "\tcosalary: " + cosalary; 
	}
	//display
	public void display() {
		System.out.println(toString());
	}
	//nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		id = sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("FullName: ");
		fullName = sc.nextLine();
		System.out.print("Cosalary: ");
		cosalary = sc.nextFloat();
	}
	//getSalary
	public abstract float getSalary();
	
}
