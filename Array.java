import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Array {
	public static void main(String[] args) {
		Collection <Object> arraylist = new ArrayList<>();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add("sanjana");
		arraylist.add(400);
		arraylist.add(500);
		//arraylist.addAll(arraylist);
		
		boolean x= arraylist.contains(100);
		System.out.println(x);
		
		boolean y = arraylist.isEmpty();
		System.out.println(y);
		
		int z = arraylist.size();
		System.out.println(z);
		
		
		for (Object c:arraylist) { 
			System.out.println(c);
		}
	
		Iterator<Object> iterator = arraylist.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
		