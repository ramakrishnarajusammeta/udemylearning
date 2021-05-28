
public abstract class Person implements IsAlive, LiveLife{

	public void speak() {
			System.out.println("Shares his/her thoughts");
	}
	
	public void breathe() {
		System.out.println("be live, remain living");
	}
	
	public void message() {
		System.out.println("life is a journey");
	}
	public abstract void eat();
	
}
