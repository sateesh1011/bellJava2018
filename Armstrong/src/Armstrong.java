import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		 int num = sc.nextInt();
		 int number = num;
		 int total = 0;
		 int arm;
		 while(number> 0) {
			 arm = number%10;
			 total = total + arm*arm*arm;
			 number = number/10;
		 }
		 if(total == num)
	            System.out.println("Given number is an Armstrong "+ num);
	        else
	            System.out.println("Given number is not an Armstrong "+ num);
	}

}
