import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		
		listNames.add("SRKRaju");
		listNames.add("Jaswanth");
		listNames.add("Harini");
		listNames.add("Swathy");
		listNames.add("SVRRaju");
		
		App app = new App();
		app.displayList(listNames);
		app.RemoveNameByPostion(0);
		System.out.println("****************");
		app.displayList(listNames);
		System.out.println("****************");
		System.out.println(listNames.get(0));
		System.out.println("****************");
		app.RemoveNameByString("SVRRaju");
		app.displayList(listNames);
		
		System.out.println("****************");
		app.modifyName(0, "Highest");
		app.displayList(listNames);
		System.out.println("****************");
		int position = app.search("Swathy");
		System.out.println("Position of Swathy = " + position);
		if (position != -1) {
			app.modifyName(position, "Goldest");
		}
		else {
			System.out.println("Invalid Entry");
		}
		System.out.println("****************");
		app.displayList(listNames);
		
	
		
	}
	
	 void displayList(ArrayList<String> names)
	{
		for (String name:names) {
			System.out.println(name);
		}
	}
	
	void RemoveNameByPostion(int postition)
	{
		listNames.remove(postition);
		
	}
	
	void RemoveNameByString(String name)
	{
		listNames.remove(name);
	}
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	int search(String name) {
		return listNames.indexOf(name);
	}
}

