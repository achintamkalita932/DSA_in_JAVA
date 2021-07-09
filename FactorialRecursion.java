package sortingDsa;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			int result = recursiveFactorial(num);
			System.out.print("The factorial of " + num +" is: " + result);
		}catch (Exception e) {
			System.out.println("You have not enter anything.");
		}
		

	}
	
	// n! = n * (n-1)!
	public static int  recursiveFactorial(int num) {
		//the statement is used to stop the recursion.
		if(num == 0) {
			return 1;
		}
		
		return num * recursiveFactorial(num-1);
		
	}

}
