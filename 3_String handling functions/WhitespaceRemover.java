Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()



package A3;
import java.util.Scanner;
public class  WhitespaceRemover {
	
	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String input) {
	        // Using replaceAll to remove all types of whitespace (space, tab, newline, etc.)
	        return input.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompting user to enter a string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Calling user-defined function to remove whitespaces
	        String result = removeWhitespace(inputString);

	        // Displaying the result
	        System.out.println("String without whitespaces: " + result);

	        scanner.close();
	    }
	}


