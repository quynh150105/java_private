package Service;
import Model.*;
import java.util.*;


public class IAuthServiceImpl implements IAuthService {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Account currentAcc;
	
	public Account getcurrentAcc() {
		return currentAcc;
	}
	
	public IAuthServiceImpl(){
		accounts.add(new Account("01","LeNhuQuynh",19,new Address("Nhon","HaNoi"),"15/01/2005","admin","123456",Role.ADMIN,Enum_Status.ACTIVE));
		accounts.add(new Account("01","A",19,new Address("Nhon","HaNoi"),"15/01/2005","user","123456",Role.USER,Enum_Status.ACTIVE));
		currentAcc = null;
	}
	
	@Override
	public void login(Scanner scanner) {
		System.out.print("username: ");
		String username = scanner.nextLine();
		System.out.print("password: ");
		String password = scanner.nextLine();
		
		for(Account acc: accounts) {
			if(acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
				System.out.println("login thanh cong!");
				currentAcc = acc;
				return;
			}		
		}
		System.out.println("Login Error!");
		
	}

	@Override
	public void logout() {
		if(currentAcc != null) {
			System.out.println("logout thanh cong!");
			currentAcc = null;
		}
		else {
			System.out.println("chua co acc nao dang nhap!");
		}
		
	}

	@Override
	public void changePassword(String username, String oldPassword, String newPassword) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap username: ");
		username = sc.nextLine();
		System.out.print("Nhap mk hien tai: ");
		oldPassword = sc.nextLine();
		System.out.print("Nhap mk moi: ");
		newPassword = sc.nextLine();
		for(Account acc: accounts) {
			if(acc.getUsername().equals(username) && acc.getPassword().equals(oldPassword)) {
				acc.setPassword(newPassword);
				System.out.println("doi mk thanh cong!");
				return;
			}
			
		}
		System.out.println("tai khoan or mk hien tai khong dung!");

		
	}

}
