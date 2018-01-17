import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.println("Enter your number");
		int num = number.nextInt();
		int reverse = 0;
		int remainder;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse of given number " + reverse);
	}

}
