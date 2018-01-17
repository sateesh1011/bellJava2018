import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int first = 1;
		int second = 1;
		int next;
		System.out.print(first+","+ second);
		
		for(int i= 3 ; i <= number; i++) {
			next = first + second;
			System.out.print( ","+ next);
			first= second;
			second = next;
			
			
		}
	}

}
