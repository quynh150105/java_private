package Service;
import Model.*;
import java.util.*;

public interface IAuthService {
	public void login(Scanner scanner);
	public void logout();
	public void changePassword(String username, String oldPassword, String newPassword);
	
}
