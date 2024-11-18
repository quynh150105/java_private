package BTVN_B5;
import java.util.Scanner;


public class Address {
	private String commune;
	private String district;
	private String city;
	
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address(String commune, String district, String city) {
		this.commune = commune;
		this.district = district;
		this.city = city;
	}
	public Address() {
		
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Commune: ");
		commune = sc.nextLine();
		System.out.print("District: ");
		district = sc.nextLine();
		System.out.print("City: ");
		city = sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-15s %-15s %-15s     ", commune, district, city);
	}
	
	
	

}
