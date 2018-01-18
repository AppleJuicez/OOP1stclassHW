import javax.swing.JOptionPane;

public class UserManagerMain {

	public static void main(String[] args) 
	{
		UserManager X = new UserManager();
		String username;
		for(int i = 0; i < 3 ; i++)
		{
			username = JOptionPane.showInputDialog("Please Enter new user's username");
			X.addNewUser(username);
		}
		X.showAllUser();
	}
}