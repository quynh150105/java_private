package KetThucHocPhan;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IGiangVienImpl ds = new IGiangVienImpl();
		GiangVien gv = new GiangVien("01","A",2020,1.1f,1.1f,"TS","CNTT",20);
		GiangVien gv1 = new GiangVien();
		// add GiangVien
		ds.addGiangVien(gv);
		gv1.nhap();		
		ds.addGiangVien(gv1);
		ds.display();
		
		// edit GiangVien
		ds.editGiangVien(gv1);
		ds.display();
		
		//search GiangVien
		System.out.print("Nhap maCBNV can tim: ");
		String maCBNV = sc.nextLine();
		ds.searchGiangVien(maCBNV);
		
		// getTotalSalary
		System.out.println("Tong Luong: " + ds.getTotalSalary("TS"));
		
	}
}
