
public class JoinThreadExample {

	public static void main(String[] args) 
	{
		Join thrd1 = new Join();
		Join thrd2 = new Join();
		Join thrd3 = new Join();
		thrd1.start();
		try
		{
			thrd1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		thrd2.start();
		thrd3.start();
	}

}
