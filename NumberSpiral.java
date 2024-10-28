import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSpiral {

	/*
		A number spiral is an infinite grid whose upper-left square has number 1. Here are the first five layers of the spiral:

		Your task is to find out the number in row y and column x.
		Input
		The first input line contains an integer t: the number of tests.
		After this, there are t lines, each containing integers y and x.
		Output
		For each test, print the number in row y and column x.
		Constraints

		1 \le t \le 10^5
		1 \le y,x \le 10^9

		Example
		Input:
		3
		2 3
		1 1
		4 2

		Output:
		8
		1
		15
	 */
	public static void main(String args[]) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Faster than Scanner
		int n_tests = Integer.parseInt(reader.readLine().trim()); // User input

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < n_tests; i++) {
			String[] coords = reader.readLine().trim().split(" ");
			long x = Long.parseLong(coords[0]);
			long y = Long.parseLong(coords[1]);

			long result; 

			if (x >= y) { 
				if (x % 2 == 0)
					result = x*x - (y-1);
				else
					result = (x-1)*(x-1) + y;
			}
			else {
				if (y % 2 == 0)
					result = (y-1)*(y-1) + x;
				else
					result = y*y - (x-1);
			}
			output.append(result).append("\n");
		}
		System.out.print(output);

		reader.close();
	}
}