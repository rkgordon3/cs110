package assignments.chap2;

import java.util.Scanner;

public class Pe21 {
	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		Scanner scanner = new Scanner(System.in);

		
		double p = Math.PI;
		
		System.out.println("Input celsius value: ");
	
		celsius = scanner.nextDouble();
		fahrenheit = (9.0/5) * celsius + 32.0;
		System.out.println(celsius +  " degress celsius is " 
		              + fahrenheit + " degrees fahr");
	}

}
