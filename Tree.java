import java.util.NavigableSet;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		NavigableSet<Object> treeSet = new TreeSet<Object>().descendingSet();
		
		treeSet.add(10);
		treeSet.add(67);
		treeSet.add(70);
		treeSet.add(5);
		treeSet.add(6);
		
		for (Object object : treeSet) {
			System.out.println(object);
			
		}
		

		
	}

}
