package Service;
import Model.*;
import java.util.*;

public interface IAccountService {
	ArrayList<Account> getAllAccount();
	
	void creatNewAccount(Account account);
	
	Account getAccountByUsername(String username);
	
	void deleteAccount(String username);
	
	void changeStatus(String username, Enum_Status status);
	
}
