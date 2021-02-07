import java.util.*;
public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number ");
		int num2 = sc.nextInt();
		if(num1%num2==0) {
			System.out.println("Numbers are divisible");
		}
		else 
			System.out.println("Numbers are not divisible");
	}

}
