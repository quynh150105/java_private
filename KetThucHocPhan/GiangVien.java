package KetThucHocPhan;
import java.util.*;

public class GiangVien extends CanBoNV{
	private String hocHamHocVi;
	private String khoaCongTac;
	private int soGioDay;
	private float luongBoSung;
	
	//getter setter
	public String getHocHamHocVi() {
		return hocHamHocVi;
	}
	public void setHocHamHocVi(String hocHamHocVi) {
		this.hocHamHocVi = hocHamHocVi;
	}
	public String getKhoaCongTac() {
		return khoaCongTac;
	}
	public void setKhoaCongTac(String khoaCongTac) {
		this.khoaCongTac = khoaCongTac;
	}
	public int getSoGioDay() {
		return soGioDay;
	}
	public void setSoGioDay(int soGioDay) {
		this.soGioDay = soGioDay;
	}
	public float getLuongBoSung() {
		return luongBoSung;
	}
	public void setLuongBoSung(float luongBoSung) {
		this.luongBoSung = luongBoSung;
	}
	
	//constructer
	public GiangVien(String maCBNV, String hoTen, int namTuyenDung, float heSoLuong, float heSoPhuCap,
			String hocHamHocVi, String khoaCongTac, int soGioDay) {
		super(maCBNV, hoTen, namTuyenDung, heSoLuong, heSoPhuCap);
		this.hocHamHocVi = hocHamHocVi;
		this.khoaCongTac = khoaCongTac;
		this.soGioDay = soGioDay;
		switch(hocHamHocVi) {
		case "TS":
			this.luongBoSung = 7000000;
			break;
		case "PGS":
			this.luongBoSung = 9000000;
			break;
		case "GS":
			this.luongBoSung = 12000000;
			break;
		default:
			this.luongBoSung = 0;
			break;
			
		}
		//this.luongBoSung = luongBoSung;
	}
	public GiangVien() {
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "GiangVien [hocHamHocVi=" + hocHamHocVi + ", khoaCongTac=" + khoaCongTac + ", soGioDay=" + soGioDay
				+ ", luongBoSung=" + luongBoSung + "]";
	}
	
	//display()
	public void display() {
		System.out.println(toString());
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("HocHamHocVi: ");
		hocHamHocVi = sc.nextLine();
		System.out.print("KhoaCongTac: ");
		khoaCongTac = sc.nextLine();
		System.out.print("soGioDay: ");
		soGioDay = sc.nextInt();
		sc.nextLine();
		switch(hocHamHocVi) {
		case "TS":
			this.luongBoSung = 7000000;
			break;
		case "PGS":
			this.luongBoSung = 9000000;
			break;
		case "GS":
			this.luongBoSung = 12000000;
			break;
		default:
			this.luongBoSung = 0;
			break;
		}
			
		
	}
	@Override
	public float getSalary() {
		if(hocHamHocVi.equals("TS"))
			luongBoSung = 7000000;
		else if(hocHamHocVi.equals("PGS"))
			luongBoSung = 9000000;
		else if(hocHamHocVi.equals("GS"))
			luongBoSung = 12000000;
		return (this.heSoLuong + this.heSoPhuCap)*2340000*1.25f + soGioDay*200000 + luongBoSung;
	}
	
	

}
