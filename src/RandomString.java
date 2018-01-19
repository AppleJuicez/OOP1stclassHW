import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class RandomString {
	
	public static String myRandomStr()
	{
		int RD;
		String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String rStr = "";
		for(int i = 0; i < 8 ; i++)
		{
			RD = (int)(Math.random() *36);
			rStr += ABC.charAt(RD);
		}
		return rStr;
		
	}
	
	public static String[] myRandom30Str()
	{
		String strArray[] = new String[30];
		String use;
		for(int i = 0 ; i< strArray.length ;i++)
		{
			use = myRandomStr();
			while(checkForDupe(strArray, use))
			{
				use = myRandomStr();
			} 
			strArray[i] = use;
		}
		return strArray;
	}
	
	public static boolean checkForDupe(String[] list,String check)
	{
		for(int i = 0;     list[i]!= null && i<list.length      ; i++)
		{
			if(check.equals(list[i]))
				return true;
		}
		return false;
	}
	
	public static String hashThis(String input , String Algo) throws NoSuchAlgorithmException
	{
		StringBuffer output = new StringBuffer();
		MessageDigest md = MessageDigest.getInstance(Algo);
		md.update(input.getBytes());
		byte[] messageDigestedB = md.digest();
		for(int i = 0; i < messageDigestedB.length ; i++)
		{
			output.append(String.format("%02x" , messageDigestedB[i] & 0xff));
		}
		return output.toString();
	}

}
