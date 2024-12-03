package Model;

public class Account extends Person {
	private String username;
	private String password;
	private Role role;
	private Enum_Status Status;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Enum_Status getStatus() {
		return Status;
	}
	public void setStatus(Enum_Status status) {
		Status = status;
	}
	public Account(String id, String fullname, int age, Address address, String birthday, String username,
			String password, Role role, Enum_Status status) {
		super(id, fullname, age, address, birthday);
		this.username = username;
		this.password = password;
		this.role = role;
		Status = status;
	}
	public Account() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Account [username=" + ", role=" + role + ", Status=" + Status
				+ "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	
}
