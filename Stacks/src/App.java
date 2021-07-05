import java.util.Stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		
		for (Integer temp:demo) {
			System.out.println(temp);
		}
		
		int tempInt = demo.pop();
		System.out.println("Deleted Integer:" + tempInt);
		
	}

}
