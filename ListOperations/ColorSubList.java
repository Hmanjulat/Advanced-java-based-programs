package A1;
import java.util.*;
public class ColorSubList {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original color list: " + colors);

	        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
	        List<String> subColors = colors.subList(0, 2);
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	    }
	}


