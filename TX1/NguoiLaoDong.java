package TX1;
import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String Name;
	protected String Address;
	
	public NguoiLaoDong() {
		this.Name = "";
		this.Address = "";
	}
	
	public NguoiLaoDong(String Name, String Address) {
		this.Name = Name;
		this.Address = Address;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		Name = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		Address = sc.nextLine();
	}
	
	public abstract double TinhLuong();
	
	public void InThongTin() {
		System.out.println("Ho Ten: " + Name);
		System.out.println("Dia Chi: " + Address);
		System.out.println("Luong Thang: " + TinhLuong());
	}
	

}
