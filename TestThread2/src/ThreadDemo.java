
public class ThreadDemo extends Thread {
	private Thread t;
	String threadName;
	ThreadDemo(String name)
	{
		threadName = name;
	}
	public void run()
	{
		System.out.println("\n Running: " + threadName);
		try
		{
			for(int i=4; i>0; i--)
			{
				System.out.println("\n Thread: " + threadName + ", " + i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread : " + threadName + "interrupted");
		}
		System.out.println("\n Thread: " + threadName + "Exting");
		
	}
	public void start()
	{
		System.out.println("\n Starting: " + threadName);
		if(t==null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
	


}
