//my first comment
import java.util.Scanner;


public class Console_Input {

	public static void main(String[] args) {
		
		int a, b;
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter first number : ");
			a = scanner.nextInt();
			System.out.print("Enter second number : ");
			b = scanner.nextInt();
			System.out.println("sum is : " + Integer.toString(a + b));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
