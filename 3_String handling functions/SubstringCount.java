Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()


package A3;
import java.util.Scanner;
public class  SubstringCount {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input main string
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        // Input substring to search
	        System.out.print("Enter the substring to count: ");
	        String subString = scanner.nextLine();

	        // Call user-defined function
	        int count = countOccurrences(mainString, subString);

	        System.out.println("The substring \"" + subString + "\" appears " + count + " times.");

	        scanner.close();
	    }

	    // User-defined function to count substring occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Loop to find substring repeatedly
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move index forward
	        }

	        return count;
	    }
	}


