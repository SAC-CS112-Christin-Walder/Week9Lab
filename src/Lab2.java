import java.util.Arrays;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		int[] aryOdd = new int[10];
		int[] aryEven = new int[10];
		int[] aryComputer = new int[10];
		int[] aryWins = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		String oddeven = "";
		int i;
		int j;
		int odd=0;
		int even=0;
		int wins=0;
		
		for (i=0; i<10; i++) {
		
		System.out.print("Is the number odd or even? ");
		String guess = input.next();
		guess = guess.toUpperCase();
		if (guess.equals("ODD"))
			odd = odd + 1;
			aryOdd[i] = odd;
		if (guess.equals("EVEN"))
			even = even + 1;
			aryEven[i] = even;

		int dice = 1 + (int)(Math.random() * 10);
		aryComputer[i] = dice;

		if (dice%2==1)
			oddeven = "ODD";
		if (dice%2==0)
			oddeven = "EVEN";
		
		System.out.printf("The number is %d. ", dice);
		
		if (guess.equals(oddeven)) {
			wins = wins + 1;
			aryWins[i] = wins;
			System.out.print("You were right!\n\n");}
		else {
			System.out.print("You were wrong...\n\n");
			aryWins[i] = wins;}
		
		}
		
		//System.out.print("Which round would you like to review? ");
		//int round = input.nextInt();
		
		for (j=0; j<10; j++) {
		
		System.out.printf("Round %d: \n", j+1);
		System.out.printf("Odd guesses: %d\n", aryOdd[j]);
		System.out.printf("Even guesses: %d\n", aryEven[j]);
		System.out.printf("Wins: %d\n\n", aryWins[j]);
		
		}
		
	}
	
}