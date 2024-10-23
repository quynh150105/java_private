package TX1;
import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
	private int songaycong;
	private double dongia;
	private double thuong;
	
	public LaoDongPhoThong() {
		super();
	}
	
	public LaoDongPhoThong(String Name, String Address, int songaycong, double dongia, double thuong) {
		super(Name, Address);
		this.songaycong = songaycong;
		this.dongia = dongia;
		this.thuong = thuong;
	}
	
	public void setSongaycong(int songaycong) {
		this.songaycong = songaycong;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSongaycong() {
		return songaycong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setThuong(double thuong) {
		this.thuong = thuong;
	}
	public double getThuong() {
		if(songaycong >= 25) {
			thuong = 100000;
		}
		else if(songaycong > 15 && songaycong <25) {
			thuong = 700000;
		}
		else {
			thuong = 0;
		}
		return thuong;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.print("nhap so ngay cong: ");
		songaycong = sc.nextInt();
		System.out.print("nhap don gia: ");
		dongia = sc.nextDouble();
	}
	

	@Override
	public double TinhLuong() {
		return songaycong * dongia * thuong;
	}
}
