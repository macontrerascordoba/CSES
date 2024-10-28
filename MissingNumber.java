import java.util.Scanner;

public class MissingNumber {

	/*
		You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.
		Input
		The first input line contains an integer n.
		The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).
		Output
		Print the missing number.
		Constraints

		2 <= n <= 2 * 10^5

		Example
		Input:
		5
		2 3 1 5

		Output:
		4
	 */
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		long length = Long.parseLong(scanner.nextLine()); // User input
		String input = scanner.nextLine();
		
		String[] input_array = input.split(" ");

		boolean odd = true;
		
		if (length % 2 == 0)
			odd = false;

		long expected = (1 + length) * (length / 2);

		if (odd)
			expected += (length / 2) + 1;

		long actual = 0;

		for (int i = 0; i < length-1; i++) {
			actual += Long.parseLong(input_array[i]);
		}

		System.out.println(Long.toString(expected - actual));

		scanner.close();
	}
}