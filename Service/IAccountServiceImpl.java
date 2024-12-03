package Service;
import Model.*;
import java.util.*;
import java.util.List;

public class IAccountServiceImpl implements IAccountService {

	@Override
	public ArrayList<Account> getAllAccount() {
		
		ArrayList<Account> list = new ArrayList<>();
		
		list.add(new Account("01","LeNhuQuynh",19,new Address("Nhon","HaNoi"),"15/01/2005","admin","123456",Role.ADMIN,Enum_Status.ACTIVE));
		list.add(new Account("01","A",19,new Address("Nhon","HaNoi"),"15/01/2005","user","123456",Role.USER,Enum_Status.ACTIVE));
		
//		for(Account acc : list) {
//			acc.display();
//		}
		return list;
	}

	@Override
	public void creatNewAccount(Account account) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		account.setId(sc.nextLine());
		System.out.print("Fullname: ");
		account.setFullname(sc.nextLine());
		System.out.print("Age: ");
		account.setAge(sc.nextInt());
		System.out.print("Address: ");
		account.setAddress(null);
		System.out.print("birthday:  ");
		account.setBirthday(sc.nextLine());
		System.out.print("Role: ");
		account.setRole(null);
		account.setStatus(Enum_Status.ACTIVE);
		System.out.println("Tao tai khoan thanh cong!");
	}

	@Override
	public Account getAccountByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeStatus(String username, Enum_Status status) {
		
		
	}

}
