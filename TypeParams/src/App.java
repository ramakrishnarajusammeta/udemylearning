
/*
 K - Key
 E - Element
 V - Value
 N - Number

 */


class Data<K,V> {
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public<E,N> void display(E element, N number) {
		System.out.println("Element:" + element + " Number = " + number);
		
	}
	
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer, String> data = new Data<Integer, String>(1,"SRK");
		
		System.out.println(data);
		data.display(25,"element");
	}

}
