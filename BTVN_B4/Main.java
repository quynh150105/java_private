package BTVN_B4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static int index = 5;
	
	//phuong thuc them sach moi
	public static Book[] ThemSach(Book[] books) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong sach them: ");
		int n = sc.nextInt();
		
		//tao mang sach moi can nhap co n phan tu 
		Book []books2 = new Book[n];
		for (int i = 0; i< n; i++) {
			books2[i] = new Book();
			books2[i].nhap();
		}		
		
		/*tao mang book moi 
		 * kich thuoc = kich thuoc mang ban dau + n sach moi
		*/
		Book []BookNew = new Book[index + n];
		
		//sao chep phan tu mang ban dau
		for(int i = 0; i< index; i++) {
			BookNew[i] = books[i];
		}
		
		//sao chep phan tu mang book2
		for(int i = 0; i< n; i++) {
			BookNew[index + i]= books2[i];
		}
		
		//khoi tao lai so luong phan tu trong mang
		index += n;
		
		//tra ve mang sau khi them sach
		return BookNew;
		
	}
	
	//phuong thuc sua thong tin
	public static void suaThongTin(Book b) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma Sach: ");
		b.setMaSach(sc.nextInt());
		sc.nextLine();
		System.out.print("Ten Sach: ");
		b.setTenSach(sc.nextLine());
		System.out.print("Ten Tac Gia: ");
		b.setTenTacGia(sc.nextLine());
		System.out.print("Nam San Xuat: ");
		b.setNamSanXuat(sc.nextInt());
		sc.nextLine();
		System.out.print("Tom tat Noi Dung: ");
		b.setTomTatNoiDung(sc.nextLine());
		System.out.print("Gia Tien: ");
		b.setGiaTien(sc.nextDouble());
		sc.nextLine();
		
	}
	
	//phuong thuc in sach lau doi nhat
	public static Book sachcu(Book[] books) {
		Book oldbook = books[0];
		for(Book b: books) {
			if(b.getNamSanXuat() < oldbook.getNamSanXuat()) {
				oldbook = b;
			}
		}
		return oldbook;
	}
	
	//phuong thuc tim sach phu hop voi gia tien
	public static List<Book> SachPhuHop(Book[] books) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("So tien ban co la: "); 
		double Tien = sc.nextDouble(); 
		List<Book> sachPhuHop = new ArrayList<>(); 
		for (Book b : books) { 
			if (b.getGiaTien() <= Tien) { 
				sachPhuHop.add(b); 
			} 
		} return sachPhuHop; 
			
	}
	
	//phuong thuc sap xep the gia 
	public static void SortByPrice(Book[] books) {
		for(int i = 0; i< books.length; i++) {
			for(int j = i+1; j< books.length; j++) {
				if(books[i].getGiaTien() > books[j].getGiaTien()) {
					Book temps = books[i];
					books[i] = books[j];
					books[j] = temps;
				}
			}
		}
	}
	
	//phuong thuc sap xep theo ten
	public static void SortByName(Book[] books) {
		for(int i = 0; i< books.length; i++) {
			for(int j = i+1; j< books.length; j++) {
				if(books[i].getGiaTien() > books[j].getGiaTien()) {
					Book temps = books[i];
					books[i] = books[j];
					books[j] = temps;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Book []books = new Book[index];
		 books[0] = new Book(1, "Toan", "T", 2024, "Mo ta Toan", 95);
		 books[1] = new Book(2, "Van", "V", 2025, "Mo ta Van", 50);
		 books[2] = new Book(3, "Tin", "Ti", 2022, "Mo ta Tin", 40);
		 books[3] = new Book(4, "Anh", "A", 2021, "Mo ta Anh", 70);
		 books[4] = new Book(5, "Hoa", "H", 2019, "Mo ta Hoa", 69);
		 
		 while(true) {
			 
			 System.out.println("1, Them sach moi");
			 System.out.println("2, Chinh sua thong tin sach");
			 System.out.println("3, In danh sach cac cuon sach trong mang");
			 System.out.println("4, In cuon sach lau doi nhat");
			 System.out.println("5, In sach phu hop voi yeu cau nguoi mua");
			 System.out.println("6, Sap xep lai danh sach");
			 System.out.println("7, Exit");
			 System.out.print("Lua chon chuc nang: ");
			 int option = sc.nextInt();
			 switch(option) {
			 case 1:
				 books = ThemSach(books);
				 break;
			 case 2:
				 System.out.print("nhap ma sach can sua thong tin: ");
				 int maSach = sc.nextInt();
				 for(Book b: books) {
					 if(b.getMaSach()==maSach) {
						 suaThongTin(b);
					 }
				 }
				 break; 
			 case 3:
				 System.out.println("danh sach la: ");
				 for(Book b: books) {
					 b.display();
				 }
				 System.out.println("---------------------------------");
				 break;
			 case 4:
				 System.out.println("Sach lau doi nhat la: ");
				 Book old = sachcu(books);
				 old.display();
				 System.out.println("---------------------------------");
				 break;
			 case 5:
				 System.out.println("---------------------------------"); 
				 List<Book> sachPhuHop = SachPhuHop(books); 
				 for (Book b : sachPhuHop) { 
					 b.display(); 
				} 
				 System.out.println("---------------------------------"); 
				 break;
				 
			 case 6:
				 System.out.println("---------------------------------"); 
				 SortByPrice(books);
				 break;
			 case 7:
				 System.exit(1);
			default:
				break;
			 }

		 }
		
	}

	

}
