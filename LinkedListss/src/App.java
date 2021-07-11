import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		//LinkedList<String> countries = new LinkedList<>();
		// OR
		List<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Srilanka");
		countries.add("Brazil");
		
		System.out.println(countries);
		
		countries.remove(0);
		System.out.println(countries);
		System.out.println("****************");
		
		for (String element : countries) {
			System.out.println("Element : " + element);
		}
		
		// OR
		System.out.println("****************");
		new App().printList(countries);
		
		
		// using 'List' interface in 'printList' 
		//ArrayList<String> names = new ArrayList<>();
		// OR
		List<String> names = new LinkedList<String>();
		
		names.add("srkraju");
		names.add("swathy");
		names.add("harini");
		System.out.println("****************");
		//new App().printListIt(names);
		
		App app = new App();
		app.printList(countries);
		Collections.sort(countries);
		System.out.println("****************");
		app.printList(countries);
		
	}
	
	void printList(List<String> list) {
		for (String element : list) {
			System.out.println("Element:" + element);
		}
	}
	
	void printListIt(List<String> list) {
		ListIterator<String> iterator =  list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element:" + iterator.next());
		}
		
		
	}

}
