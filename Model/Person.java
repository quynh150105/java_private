package Model;
import java.util.*;

public class Person {
	protected String id;
	protected String fullname;
	protected int age;
	protected Address address;
	protected String birthday;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public Person(String id, String fullname, int age, Address address, String birthday) {
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.address = address;
		this.birthday = birthday;
	}
	public Person() {
		super();
	}
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullname=" + fullname + ", age=" + age + ", address=" + address.toString() + ", birthday="
				+ birthday + "]";
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id:  ");
		id = sc.nextLine();
		System.out.print("fullname: ");
		fullname = sc.nextLine();
		System.out.print("age: ");
		age = sc.nextInt();
		sc.nextLine();
		address.nhap();
		System.out.print("birthday: ");
		birthday = sc.nextLine();
		
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
}
