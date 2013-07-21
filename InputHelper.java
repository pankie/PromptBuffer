import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {

	// Enter a String that will prompt the user.
	public static String getInput(String prompt){

		BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
		
		// prompt the user
		System.out.print(prompt);
		System.out.flush();
		
		// returns the value as String
		try {
			return stdin.readLine();
		} catch (Exception e){
			return "Error: " + e.getMessage();
		}
	}
	
	// Example usage
	public static double getDoubleInput(String prompt) throws NumberFormatException {

		// prompt the user
		String input = getInput(prompt);

		// returns the string as a double data type
		return Double.parseDouble(input);
	}
	
	
}
