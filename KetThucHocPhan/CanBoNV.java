package KetThucHocPhan;
import java.util.*;

public abstract class CanBoNV {
	protected String maCBNV;
	protected String hoTen;
	protected int namTuyenDung;
	protected float heSoLuong;
	protected float heSoPhuCap;
	
	// getter setter
	public String getMaCBNV() {
		return maCBNV;
	}
	public void setMaCBNV(String maCBNV) {
		this.maCBNV = maCBNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamTuyenDung() {
		return namTuyenDung;
	}
	public void setNamTuyenDung(int namTuyenDung) {
		this.namTuyenDung = namTuyenDung;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public float getHeSoPhuCap() {
		return heSoPhuCap;
	}
	public void setHeSoPhuCap(float heSoPhuCap) {
		this.heSoPhuCap = heSoPhuCap;
	}
	
	//constructer
	public CanBoNV(String maCBNV, String hoTen, int namTuyenDung, float heSoLuong, float heSoPhuCap) {
		this.maCBNV = maCBNV;
		this.hoTen = hoTen;
		this.namTuyenDung = namTuyenDung;
		this.heSoLuong = heSoLuong;
		this.heSoPhuCap = heSoPhuCap;
	}
	public CanBoNV() {
		
	}
	
	//toString
	@Override
	public String toString() {
		return "CanBoNV [maCBNV=" + maCBNV + ", hoTen=" + hoTen + ", namTuyenDung=" + namTuyenDung + ", heSoLuong="
				+ heSoLuong + ", heSoPhuCap=" + heSoPhuCap + "]";
	}
	
	// getSalary()
	public abstract float getSalary();
	
	//Display
	public void display() {
		System.out.println(toString());
	}
	
	// Nhap Thong tin
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin: ");
		System.out.print("MaNVCB: ");
		maCBNV = sc.nextLine();
		System.out.print("HoTen: ");
		hoTen = sc.nextLine();
		System.out.print("namTuyenDung: ");
		namTuyenDung = sc.nextInt();
		sc.nextLine();
		System.out.print("heSoLuong: ");
		heSoLuong = sc.nextFloat();
		System.out.print("heSoPhuCap: ");
		heSoPhuCap = sc.nextFloat();
		
	}
	
}
