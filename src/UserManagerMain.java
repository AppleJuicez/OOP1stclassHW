import javax.swing.JOptionPane;

public class UserManagerMain {

	public static void main(String[] args) 
	{
		UserManager X = new UserManager();
		String username;
		for(int i = 0; i < 3 ; i++)
		{
			username = JOptionPane.showInputDialog("Please Enter new user's username");
			while(username == null || username.matches("") || containsRestrictedCharacter(username))
			{
				username = JOptionPane.showInputDialog("Please Reenter new user's username");
			}
			X.addNewUser(username);
		}
		X.showAllUser();
	}
	
	
	public static boolean containsRestrictedCharacter(String ToBeChecked)
	{
		char[] resChar = {'<' , '>', ':','/','\\','|','?','*',' '};
		char[] checking = ToBeChecked.toCharArray();
		for(int i = 0; i < ToBeChecked.length() ; i++) //for all char in string
		{
			for(int j = 0 ; j < resChar.length ; j++)
			{
				if(checking[i]==resChar[j])
					return true;
			}
		}
		return false;
	}
}