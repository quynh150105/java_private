package BTVN_B5;
import java.util.Scanner;

public  abstract class Person {
	protected String name;
	protected int age;
	protected Address address;
	
	public Person(String name, int age, Address address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person() {
		this.address = new Address();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Age: ");
		age = sc.nextInt();
		sc.nextLine();
		address.input();
	}
	
	public void output() {
		System.out.printf("%-15s %-15d",name, age);
		address.output();
	}
	
	
}
