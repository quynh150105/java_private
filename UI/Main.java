package UI;
import Model.*;
import Service.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IAuthServiceImpl service = new IAuthServiceImpl();
		IAccountServiceImpl accounts = new IAccountServiceImpl();
		service.login(sc);
		if(service.getcurrentAcc().getRole().equals(Role.ADMIN)) {
			while(true) {
				System.out.println("===== HE THONG QUAN LY TAI KHOAN =====");
				System.out.print("Xin chao ADMIN: ");
				System.out.println(service.getcurrentAcc().getUsername());
				System.out.println("Chon mot trong cac chua nang sau: ");
				System.out.println("1, Xem danh sach tai khoan");
				System.out.println("2, Tao tai khoan moi");
				System.out.println("3, Tim kiem tai khoan theo username");
				System.out.println("4, Xoa tai khoan");
				System.out.println("5, Thay doi trang thai tai khoan");
				System.out.println("6, xem thong tin ca nhan");
				System.out.println("0, Dang xuat");
				System.out.println("-----------------------------------------------------");
				System.out.println("Nhap lua chon cua ban: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 0:
					service.logout();
//					break;
					System.exit(0);
				case 1:
					accounts.getAllAccount();
					break;
				case 2:
					Account acc = new Account();
					accounts.creatNewAccount(acc);
				
				}
			}
		}
		else {
			while(true) {
				System.out.println("===== HE THONG NGUOI DUNG =====");
				System.out.print("Xin chao USER: ");
				System.out.println(service.getcurrentAcc().getUsername());
				System.out.println("Chon mot trong cac chua nang sau: ");
				System.out.println("1, Doi mat khau");
				System.out.println("2, Xem thong tin ca nhan");
				System.out.println("0, Dang xuat");
				System.out.println("Nhap lua chon cua ban: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 0:
					service.logout();
					System.exit(0);
				case 1:
					String username = sc.nextLine();
					String oldpassword = sc.nextLine();
					String newpassword = sc.nextLine();
					service.changePassword(username, oldpassword, newpassword);
					break;
				case 2:
					service.getcurrentAcc().display();

					break;
				}
				
			}
		
		}
	}
}
