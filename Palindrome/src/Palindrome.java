import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int num = sc.nextInt();
		int reverse = 0;
		int remainder;
		int number;
		number = num;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if (number == reverse) {
			System.out.println("Number is palindrome" + number);
		} else {
			System.out.println("Number is not a palindrome");
		}
	}

}
