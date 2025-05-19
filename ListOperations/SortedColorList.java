package A1;
import java.util.*;
public class SortedColorList {
	
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Yellow");
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original color list: " + colors);

	        // Sorting the list
	        Collections.sort(colors);

	        // Display sorted list
	        System.out.println("Sorted color list: " + colors);
	    }
	}


