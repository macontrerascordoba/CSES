import java.util.Scanner;

public class Repetitions {

	/*
	 	You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
		Input
		The only input line contains a string of n characters.
		Output
		Print one integer: the length of the longest repetition.
		Constraints

		1 \le n \le 10^6

		Example
		Input:
		ATTCGGGA

		Output:
		3
	 */
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // User input
		
		String[] input_array = input.split(""); 

		long highest = 0;
		long counter = 1;

		String previousLetter = input_array[0];

		for (int i = 1; i < input_array.length; i++) {
			String currentLetter = input_array[i];
			if (currentLetter.equals(previousLetter)) {
				counter ++;
			}
			else {
				if (counter > highest)
					highest = counter;
				counter = 1;
			}
			previousLetter = currentLetter;
		}
		
		if (counter > highest)
			highest = counter;

		System.out.println(Long.toString(highest));

		scanner.close();
	}
}