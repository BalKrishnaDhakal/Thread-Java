
public class ThreadPriority {

	public static void main(String[] args) 
	{
		Test thrd1 = new Test();
		Test thrd2 = new Test();
		Test thrd3 = new Test();
		thrd1.setPriority(Thread.MIN_PRIORITY);
		thrd2.setPriority(Thread.NORM_PRIORITY);
		thrd3.setPriority(Thread.MAX_PRIORITY);
		thrd1.start();
		thrd2.start();
		thrd3.start();
	}

}
