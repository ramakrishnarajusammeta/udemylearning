import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printListData(List<E> list) {
		for (E element: list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayData(E[] arrayData) {
		for (E element: arrayData)
			System.out.println(element);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Data data = new Data();
		System.out.println("Printing Integers List");
		data.printListData(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		System.out.println("Printing String List");
		data.printListData(list2);
		
		String[] stringArrary = {"One", "Two", "Three"};
		Integer[] integerArray = {1,2,3};
		//Data data2 = new Data();
		System.out.println("Printing String Arrary");
		data.printArrayData(stringArrary);
		System.out.println("Printing Integer Array");
		data.printArrayData(integerArray);
		Double[] doubleArray = {2.3, 4.5, 5.6};
		System.out.println("Printing Double Array");
		data.printArrayData(doubleArray);
	}

}
