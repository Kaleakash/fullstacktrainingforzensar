import java.util.*;
public class CollectionExpDemo {
	public static void main(String args[]) {
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(100);			// auto-boxing : converting primitive to object 
	//ll.add("Ravi");
	//ll.add(30.40);	
	ll.add(200);
	ll.add(300);
	

	int n = ll.get(0);			// auto - unboxing : converting object to primitive 
	System.out.println(n);
	}
}