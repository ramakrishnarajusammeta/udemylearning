import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("What's Your Name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hey there, " + name +", Have a nice day");
		
		System.out.println("What's Your Age?");
		int age = sc.nextInt();
		System.out.println("Your Age = " + age);
		sc.close();
	}

}
