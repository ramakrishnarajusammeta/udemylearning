import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length())
			return 0;
		else if (name.length() == obj.name.length())
			return -1;
		else 
			return 1;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
public class App {

	public static void main(String[] args) {
		List<Names> names = new LinkedList<Names>();
		names.add (new Names("Chand"));
		names.add (new Names("Harini"));
		names.add (new Names("Swathy"));
		names.add (new Names("Jaswanth"));
		
		App app = new App();
		app.printList(names);
		
		Collections.sort(names);
		System.out.println("**********");
		app.printList(names);
	}
	
	void printList(List <Names> list) {
		ListIterator<Names> iterator =  list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
