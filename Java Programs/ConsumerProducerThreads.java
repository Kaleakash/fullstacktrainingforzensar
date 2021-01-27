class InterThread{
	int n;
	boolean value=false;
	
	public synchronized void put(int n) 
	{
	   while(value) {
		   try {
			   wait();
		   }
		   catch(Exception e) {
			   
		   }
	   }
	   System.out.println("Deposit Put : "+ n + " Produce");
	   this.n=n;
	   value=true;
	   notify();
	}
	
	public synchronized void get()
	{
		while(!value)
		{
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Withdraw get : "+ n + " Consume");
		value=false;
		notify();
	}
}

class Consumer implements Runnable
{
	InterThread cp;
	
	public Consumer(InterThread cp)
	{
		this.cp=cp;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run() {
		while(true)
		{
			cp.get();
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}


class Producer implements Runnable
{
	InterThread cp;
	
	public Producer(InterThread cp)
	{
		this.cp=cp;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run() {
		int i=0;
		while(true)
		{
			cp.put(i++);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}


public class ConsumerProducerThreads {

	public static void main(String[] args) {
		InterThread cp=new InterThread();
		
		Producer p = new Producer(cp);
		Consumer c = new Consumer(cp);

	//Thread t = new Thread(p,"First Thread");
	//t.start();		
	}

}