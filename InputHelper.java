import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {

	// Enter a String that will prompt the user.
	public static String getInput(String prompt){
		BufferedReader stdin = 
			new BufferedReader( new InputStreamReader(System.in));
		
		// prompt the user
		System.out.print(prompt);
		System.out.flush();
		
		// returns the requested string
		try {
			return stdin.readLine();
		} catch (Exception e){
			return "Error: " + e.getMessage();
		}
	}
	
	
	public static double getDoubleInput(String prompt) throws NumberFormatException {
		String input = getInput(prompt);
		return Double.parseDouble(input);
	}
	
	
}
