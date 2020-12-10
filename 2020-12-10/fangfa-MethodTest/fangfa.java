public class fangfa
{
	public static void main(String args[])
	{
		fangfa mt=new fangfa();
		boolean loginResult=mt.login("zs","zs123");
		if (loginResult)
		{
			System.out.println("Ìø×ªµ½Ö÷Ò³");
		}else {
				System.out.println("´íÎó");
			}
	}
	public boolean login(String username,String password)
	{
	if(username.equals("zs")&&password.equals("zs123"))
		
	{
		return true;
	}
		else{
			return false;
		}
}
}

