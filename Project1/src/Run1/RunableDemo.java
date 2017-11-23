package Run1;

public class RunableDemo implements Runnable 
{
	
	private Thread t;
	private String threadName;
	RunableDemo(String name)
	
	{
		threadName=name;
		System.out.println("\n Creating " + threadName);
	}
	public void run()
	{
		System.out.print("\n Running " + threadName);
		try
		{
			for(int i=4; i>0; i--)
			{
				System.out.println("\n Thread " + threadName + ", " +i);
				Thread.sleep(3000);
			}
		}
		
		catch (Exception e)
		{
			System.out.println("\n Thread: " + threadName + "interrupted");
		}
		System.out.println("\n Thread: " + threadName + "exting");
	}
	public void start()
	{
		System.out.println("\n Starting " + threadName);
		if(t==null)
		{
			t= new Thread(this, threadName);
			t.start();
		}
	}
	
}
