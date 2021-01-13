import java.util.Scanner;
class Demo {
	public static void main(String args[]) {
	
	//System.out.println("Size of array is "+num.length);
	Scanner obj = new Scanner(System.in);
	System.out.println("How many number do you want to store?");
	int n = obj.nextInt();
	int []num = new int[n];
	System.out.println("Enter the number one by one");
	for(int i=0;i<n;i++) {
		num[i]=obj.nextInt();
	}		
	System.out.println("Number are ");
	for(int n1:num) {
		System.out.println("Number are "+n1);
	}
	}
}	 