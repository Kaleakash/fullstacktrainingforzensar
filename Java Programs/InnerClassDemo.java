
class InnerClassDemo {
	public static void main(String args[]) {
	

		class Inner {
			void dis1() {
				System.out.println("Local Inner class");
			}
		}	

		Inner in = new Inner();
		in.dis1();

		
	}
}