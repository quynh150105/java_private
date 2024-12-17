package KetThucHocPhan;
import java.util.*;

public class IGiangVienImpl implements IGiangVien {

	ArrayList<GiangVien> ds = new ArrayList<>();
	
	@Override
	public void addGiangVien(GiangVien gv) {
		try {
			for (GiangVien giangvien : ds) {
				if(giangvien.getMaCBNV().equals(gv.getMaCBNV())) {
					System.out.println("Ma Giang Vien Da Ton Tai!");
					return;
				}
			}
			ds.add(gv);
			System.out.println("Them Thanh Cong!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void editGiangVien(GiangVien gv) {
		Scanner sc = new Scanner(System.in);
		try {
			boolean check = false;
			for(GiangVien giangvien: ds) {
				if(giangvien.getMaCBNV().equals(gv.getMaCBNV())) {
					System.out.println("Nhap thong tin can thay doi: ");
					System.out.print("HoTen: ");
					giangvien.setHoTen(sc.nextLine());
					System.out.print("namTuyenDung: ");
					giangvien.setNamTuyenDung(sc.nextInt());
					sc.nextLine();
					System.out.print("heSoLuong: " );
					giangvien.setHeSoLuong(sc.nextFloat());
					sc.nextLine();
					System.out.print("heSoPhuCap: ");
					giangvien.setHeSoPhuCap(sc.nextFloat());
					sc.nextLine();
					System.out.print("hocHamHocVi: ");
					giangvien.setHocHamHocVi(sc.nextLine());
					System.out.print("KhoaCongTac: ");
					giangvien.setKhoaCongTac(sc.nextLine());
					System.out.print("SoGioDay: ");
					giangvien.setSoGioDay(sc.nextInt());
					sc.nextLine();
					System.out.println("Edit Thanh Cong!");	
					check = true;
					break;
				}
			}
			if(!check) 
				System.out.println("GiangVien khong co trong danh sach!");			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void searchGiangVien(String maCBNV) {
		try {
			boolean check = false;
			for(GiangVien giangvien : ds) {
				if(giangvien.getMaCBNV().equals(maCBNV)) {
					System.out.println("Search Successfull!");
					giangvien.display();
					check = true;
					break;
				}
			}
			if(!check)
				System.out.println("Khong tim thay giang vien!");			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public float getTotalSalary(String hocHamHocVi) {
		float sum = 0;
		try {			
			for(GiangVien giangvien : ds) {
				if(giangvien.getHocHamHocVi().equals(hocHamHocVi)) {
					sum += giangvien.getSalary();
				}
			}			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return sum;
	}
	
	public void display() {
		System.out.println("Danh sach giang vien: ");
		for(GiangVien giangvien: ds) {
			giangvien.display();
		}
	}

}
