import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		int i;
		int sum = 0;
		for (i = 2; i < num; i++)
			if (num % i == 0)
				break;
		if (i == num)
			System.out.println("Given number is prime");

		else
			System.out.println("Given number is not prime");

	}

}
