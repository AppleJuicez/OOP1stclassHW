
public class User 
{
	public String username;
	public String password;
	
	public User(String username)
	{
		this.username = username;
		this.password = RandomString.myRandomStr();
	}
	
	public void showUserDetail()
	{
		System.out.println(	"\nusername = " + this.username + 
							"\npassword = " + this.password);
	}
}
