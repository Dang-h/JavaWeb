package bean;

/**
 * 
 * 
 * @Description: 用户对象
 * @ClassName: User
 *
 * @return:
 *
 * @author: Dangh
 * @date: 2019年4月27日 下午7:17:49
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	public User() {
		super();
	}
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
	
}