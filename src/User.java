
public class User 
{
	public String username;
	private String password;
	
	public User(String username)
	{
		this.username = username;
		this.password = RandomString.myRandomStr();
	}
	
	public void showUserDetail()
	{
		System.out.println("username = " + this.username + "\npassword = " + this.password);
	}
}
