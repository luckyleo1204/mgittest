import java.util.*;
public class CalculatorMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double result , num1 , num2;
		System.out.println("Enter your choice");
		char choice = sc.next().charAt(0);
		switch (choice) {
		case 'A':
			num1 = AcceptInput(1);
			num2 = AcceptInput(2);
			result = num1+num2;
			System.out.println("Result is "+result);
		}
	}
	public static double AcceptInput(int i) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number "+i+":");
		double num = sc.nextDouble();
		return num;
	}

}
