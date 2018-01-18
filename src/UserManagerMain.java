
public class UserManagerMain {

	public static void main(String[] args) 
	{
		UserManager X = new UserManager();
		for(int i = 0; i < 3 ; i++)
		{
			X.addNewUser();
		}
		X.showAllUser();

	}

}