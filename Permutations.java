import java.util.Scanner;

public class Permutations {

	/*
		A permutation of integers 1,2,\ldots,n is called beautiful if there are no adjacent elements whose difference is 1.
		Given n, construct a beautiful permutation if such a permutation exists.
		Input
		The only input line contains an integer n.
		Output
		Print a beautiful permutation of integers 1,2,\ldots,n. If there are several solutions, you may print any of them. If there are no solutions, print "NO SOLUTION".
		Constraints

		1 \le n \le 10^6

		Example 1
		Input:
		5

		Output:
		4 2 5 3 1
		Example 2
		Input:
		3

		Output:
		NO SOLUTION
	 */
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		long input = Long.parseLong(scanner.nextLine()); // User input
		scanner.close();

		if (input == 1) {
			System.out.println("1");
			return;
		}

		if (input <= 3) {
			System.out.println("NO SOLUTION");
			return;
		}

		StringBuilder evens = new StringBuilder();
		StringBuilder odds = new StringBuilder();

		for (int i = 1; i <= input; i+=2) {
			if ((i + 1) <= input)
				evens.append(i+1).append(" ");
			odds.append(i).append(" ");
		}

		StringBuilder result = new StringBuilder();
		result.append(evens).append(odds);

		System.out.println(result.toString().trim());
	}
}