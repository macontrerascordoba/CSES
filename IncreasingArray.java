import java.util.Scanner;

public class IncreasingArray {

	/*
		You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
		On each move, you may increase the value of any element by one. What is the minimum number of moves required?
		Input
		The first input line contains an integer n: the size of the array.
		Then, the second line contains n integers x_1,x_2,\ldots,x_n: the contents of the array.
		Output
		Print the minimum number of moves.
		Constraints

		1 \le n \le 2 \cdot 10^5
		1 \le x_i \le 10^9

		Example
		Input:
		5
		3 2 5 1 7

		Output:
		5
	 */
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		long length = Long.parseLong(scanner.nextLine()); // User input
		String input = scanner.nextLine();
		
		String[] input_array = input.split(" ");

		long counter = 0;
		
		long prev_number = Long.parseLong(input_array[0]);

		for (int i = 1; i < length; i++) {
			long curr_number = Long.parseLong(input_array[i]);

			if (curr_number < prev_number) {
				long diference = prev_number-curr_number;
				counter += diference;
				curr_number = prev_number;
				input_array[i] = Long.toString(curr_number);
			}
			else
				prev_number = curr_number;

		}
		
		System.out.println(counter);

		scanner.close();
	}
}