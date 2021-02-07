import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = sc.nextInt();
		System.out.println("Before Swapping \n First Number :"+firstNumber+"\t Second Number :"+secondNumber);
		 
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber ;
		firstNumber = firstNumber - secondNumber ;
		System.out.println("After Swapping \n First Number :"+firstNumber+"\t Second Number :"+secondNumber);

	}

}
