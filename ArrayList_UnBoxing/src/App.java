import java.util.ArrayList;

class intWrapper {
	public int intValue;
	
	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}

public class App {

	
	public static void main(String[] args) {
		
		//ArrayList <Integer> studentNumbers = new ArrayList <>();
		
		ArrayList <intWrapper> studentNumbers = new ArrayList<> ();
		
		studentNumbers.add(new intWrapper(23));
		System.out.println(studentNumbers.get(0).getIntValue());
		
	}

}
