import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

public class UserManagerMain {

	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		UserManager X = new UserManager();
		String username,user_status;
		for(int i = 0; i < 3 ; i++)
		{
			username = JOptionPane.showInputDialog("Please Enter new user's username");
			X.addNewUser(username);
		}
		// X.showAllUser();
		
		
		/*for(int i = 0; i < 3 ; i++)
		{
			username = JOptionPane.showInputDialog("Please Enter new user's username");
			apply_date = JOptionPane.showInputDialog("Please Enter new user's apply date");
			X.addNewMember(username,apply_date);
		}*/
		
		 
		for(int i = 0; i < 3 ; i++)
		{
			username = JOptionPane.showInputDialog("Please Enter new member user's username");
			user_status = JOptionPane.showInputDialog("Please Enter new member user's status");
			X.addNewMember(username , user_status);
		}
		X.showAllUser();
	}
	
	
	
	
	
	
	
	
	public static boolean containsRestrictedCharacter(String ToBeChecked)
	{
		if(ToBeChecked == null || ToBeChecked.matches(""))
			return true;
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