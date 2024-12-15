package Kthp;
import java.util.*;

public interface IEmployeeManager {
	public void addEmployee(Employee e);
	public void editEmployee(Employee e);
	public void searchEmployee(String fullName);
	public float getTotalSalary();
	
	
}
