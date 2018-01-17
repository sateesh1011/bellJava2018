import java.util.Scanner;

public class MinNumber {
	public static void main(String[] args) {
		int number=0;
		System.out.println("enter 4 numbers");
      	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c =sc.nextInt();
      	int d = sc.nextInt();
      	if((a<b && a<c) && a<d) {
      		System.out.println("Smaller number "+ a);
      	}else if ((b<c && b<d) && b<a) {
      		System.out.println("Smaler number "+ b);
      	}else if ((c<d && c<a)&& c<b) {
      		System.out.println("Smaller number "+ c);
      	}else {
      		System.out.println("Smaller number "+ d);
      	}
	
	}}
