
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.swing.JOptionPane;


public class MemberUser extends User 
{

	
	public String member_type;
	public Date apply_date;
	//DateFormat df =  new SimpleDateFormat("dd / mm / yyyy");
	
	/*public MemberUser(String username ) //page39
	{
		super(username);
		this.apply_date = new Date();
		String user;
		user = JOptionPane.showInputDialog("Please Enter new member user's status");
		if(user.equalsIgnoreCase("gold") || user.equalsIgnoreCase("silver"))
		{
			this.member_type = user.toLowerCase();
		}
		else
		{
			this.member_type = "standard";
		}
	}*/
	
	public MemberUser(String username ,String member_type) throws NoSuchAlgorithmException //page40
	{
		super(username);
		this.apply_date = new Date();
		if(member_type.equalsIgnoreCase("gold") || member_type.equalsIgnoreCase("silver"))
		{
			this.member_type = member_type.toLowerCase();
		}
		else
		{
			this.member_type = "standard";
		}
		String password;
		password = JOptionPane.showInputDialog("Please Enter Your password");
		this.password = RandomString.hashThis(password, "MD5");
	}
	



	@Override
	public void showUserDetail() {
		super.showUserDetail();
		System.out.println(	"apply date = " + this.apply_date +
							"\nmember type = "+ this.member_type);
	}
	
	
	
}
