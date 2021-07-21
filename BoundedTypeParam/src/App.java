
class Data<K extends Number,V extends App> {
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	// restricts N to be Number only
	public <E,N extends Number> void display (E element, N number) {
		System.out.println("Element:" + element + "\nNumber:" + number);
		
	}
	
}

public class App {

	public static void main(String[] args) {
	Data<Integer,App> data = new Data<Integer,App>(1,new App());
	data.display("element", 1.2);
	data.getValue().test();
	System.out.println(data.getKey());
	

	}
	
	public void test() {
		System.out.println("Testing...");
	}

}
