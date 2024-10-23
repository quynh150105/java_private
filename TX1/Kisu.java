package TX1;
import java.util.Scanner;

public class Kisu extends NguoiLaoDong {
	private double luongcoban;
	private int hesoluong;
	private double  thuong;
	private int songaycong;
	 private double luong;
	
	public Kisu() {
		super();
	}
	
	public Kisu(String Name, String Address, double luongcoban, int hesoluong, double thuong, int songaycong, double luong) {
		super(Name, Address);
		this.luongcoban = luongcoban;
		this.hesoluong = hesoluong;
		this.thuong = thuong;
		this.songaycong = songaycong;
		this.luong = luong;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}
	public void setThuong(double thuong) {
		this.thuong = thuong;
	}
	public void setSongaycong(int songaycong) {
		this.songaycong = songaycong;
	}
	
	public int getSongaycong() {
		return songaycong;
	}
	public double getLuongcoban() {
		return luongcoban;
	}
	public int getHesoluong()
	{
		return hesoluong;
	}
	public double getThuong() {
		Scanner sc = new Scanner(System.in);
		if(songaycong >= 25) {
			thuong = 200000;
		}
		else if(songaycong > 15 && songaycong <25) {
			thuong = 1000000;
		}
		else {
			thuong = 50000;
		}
		return thuong;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.print("nhap luong co ban: ");
		luongcoban = sc.nextDouble();
		System.out.print("nhap he so luong: ");
		hesoluong = sc.nextInt();
	}
	
	
	@Override
	public double TinhLuong() {
		return luong = luongcoban * hesoluong * thuong;
	}

}
