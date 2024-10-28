import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Template {

	/*
	 * Descriptions
	 */
	public static void main(String args[]) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine().trim(); // User input
		
		System.out.println(input);

		reader.close();
	}
}