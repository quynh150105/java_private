package Model;
import java.util.*;

public class Address {
	private String street;
	private String city;
	
	public Address() {
		
	}

	public Address(String street, String city) {
		
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Street: ");
		street = sc.nextLine();
		System.out.print("city: ");
		city = sc.nextLine();
	}
	
		
}
