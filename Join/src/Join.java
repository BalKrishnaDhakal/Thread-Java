
public class Join extends Thread
{
	
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println();
			
		}
	}
}
