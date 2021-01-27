class A implements Runnable {
	String s1,s2;
	A(String s1, String s2) {
		this.s1 = s1;
		this.s2=s2;
	}
	public void run() {
		synchronized(s1) {					//lock s1 java object 
			System.out.println("Thread1 object lock as s1"+s1);
			try{
				Thread.sleep(1000);
				System.out.println("Thread1 is waiting for to release the resource");
			}catch(Exception e){}
			synchronized(s2) {
				System.out.println("Thread1 object lock as s2");
			}			
		}

		
	}
}

class B implements Runnable {
	String s1,s2;
	B(String s1, String s2) {
		this.s1 = s1;
		this.s2=s2;
	}
	public void run() {
		synchronized(s2) {			// s2 lock 
			System.out.println("Thread1 object lock as s2");
			try{
				Thread.sleep(1000);
				System.out.println("Thread2 is waiting for to release the resource");
			}catch(Exception e){}
			synchronized(s1) {
				System.out.println("Thread1 object lock as s1");
			}
		}
	}
}
class DeadLock {
	public static void main(String args[]) {
	String str1="Java";
	String str2="Python";
	A obj1 = new A(str1,str2);
	B obj2 = new B(str1,str2);
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();
	}
}
