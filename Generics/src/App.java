
/*class Data {
		private Object obj;
		
		public Data(Object obj) {
			this.obj = obj;
		}

		public Object getObj() {
			return obj;
		}

		@Override
		public String toString() {
			return "Data [obj=" + obj + "]";
		}
		
}*/

class GenericClass<T> {
	private T data ;

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
	
}
public class App {

	public static void main(String[] args) {
		
	/*	Data data = new Data("Some String");
		String variable = (String) data.getObj();
		
		System.out.println(variable);*/
		
		GenericClass<String> genericdata = new GenericClass<String>("Some Data");
		String data =  genericdata.getData();
		System.out.println(data);
		
			
	}

}
