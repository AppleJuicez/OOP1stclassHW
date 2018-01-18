
public class UserManager 
{
		public User[] userlist;
		
		public UserManager()
		{
			userlist = new User[50];
		}
		
		public void showAllUser()
		{
			for(int i = 0;     this.userlist[i]!=null && i< this.userlist.length     ;  i++)  
			{
				userlist[i].showUserDetail();
			}
		}
		
		public void addNewUser(String username)
		{
			for(int i =0; i< this.userlist.length ; i++)
			{
				if(this.userlist[i] == null)
				{
					userlist[i] = new User(username);
					break;
				}
			}
		}
}