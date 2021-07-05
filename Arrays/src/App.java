
public class App {

	public static void main(String[] args) {
		int[] intVariableArray = {1,2,3,4,5,6,7,8,9,10};
		
		for( int i=0; i<intVariableArray.length; i++) {
			System.out.println(intVariableArray[i]); 
		}
		
		for (int variable : intVariableArray){
			System.out.println(variable); 
		 }
		
	}

}
