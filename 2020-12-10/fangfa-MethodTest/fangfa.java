public class fangfa
{
	public static void main(String args[])
	{
		fangfa mt=new fangfa();
		boolean loginResult=mt.login("zs","zs123");
		if (loginResult)
		{
			System.out.println("��ת����ҳ");
		}else {
				System.out.println("����");
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

