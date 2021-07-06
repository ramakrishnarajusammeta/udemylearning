import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		
		System.out.println(countries);
		
		countries.remove(0);
		System.out.println(countries);
		
		for (String element : countries) {
			System.out.println("Element : " + element);
		}
	}

}
