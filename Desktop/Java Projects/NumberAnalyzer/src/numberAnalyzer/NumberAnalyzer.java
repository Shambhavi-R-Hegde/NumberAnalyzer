package numberAnalyzer;

import java.util.Scanner;

public class NumberAnalyzer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("======Number Analyzer Pro Menu======");
			System.out.println("1. Analyze a Number");
			System.out.println("2. Compare 2 Numbers");
			System.out.println("3. Exit");
			System.out.println("Please make a choice: ");
			choice =sc.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.println("Please Enter a number to be analyzed: ");
					int number=sc.nextInt();
					analyzeNumber(number);
					break;
				case 2:
					System.out.println("Enter the first number:");
					int num1=sc.nextInt();
					System.out.println("Enter the second number:");
					int num2=sc.nextInt();
					compareTwoNums(num1,num2);
					break;
				case 3:
					System.out.println("Exiting Number Analyzer Pro....");
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		}while(choice!=3);
		sc.close();
	}
	public static void analyzeNumber(int number) {
		
		System.out.println("\n=== Analysis Result ===");
		
		System.out.println("Square: "+(number*number)+
				"\nCube: "+(number*number*number)+
				"\nDouble: "+(number*2)+
				"\nHalf: "+(number/2.0));
		System.out.println("Even: " + (number % 2 == 0));
        System.out.println("Positive: " + (number > 0));
        System.out.println("Between 10 and 50: " + (number >= 10 && number <= 50));
        
		boolean div3 = number % 3 == 0;
        boolean div5 = number % 5 == 0;

        System.out.println("Divisible by 3: " + div3);
        System.out.println("Divisible by 5: " + div5);
        System.out.println("Divisible by both 3 and 5: " + (div3 && div5));
	}
	
	public static void compareTwoNums(int num1,int num2) {
		
		System.out.println("\n=== Comparison Result ===");

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Larger number: " + max);
        System.out.println("Are equal: " + (num1 == num2));
        System.out.println("Difference: " + Math.abs(num1 - num2));
	}

}
