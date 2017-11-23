
public class Test extends Thread 
{
	public void run()
	{
		System.out.println("\n Priority of the running thread: " + Thread.currentThread().getName() + "is" + Thread.currentThread().getPriority());
		
	}
}
