
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class Data<T> {
	
	private T myVariable;

	public T getMyVariable() {
		return myVariable;
	}

	
	public Data(T myVariable) {
		this.myVariable = myVariable;
	}


	public void setMyVariable(T myVariable) {
		this.myVariable = myVariable;
	}


	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
		List<Data<String>> elements = new LinkedList<>();
		
		elements.add (new Data<String>("Some Text"));
		elements.add (new Data<String>("Some New Text"));
		App app = new App();
		
		app.printList(elements);
	}	
	
	void printList(List<Data<String>> list) {
		
		Iterator<Data<String>> iterator  = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Element:" + iterator.next().getMyVariable());
		}
	}

}
