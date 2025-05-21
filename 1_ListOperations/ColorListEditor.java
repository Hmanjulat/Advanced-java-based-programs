package A1;
import java.util.*;
public class ColorListEditor {
	    public static void main(String[] args) {
	        // Creating ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original color list: " + colors);

	        // Remove 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedElement = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedElement);
	        }

	        // Remove "Blue" by value
	        boolean removed = colors.remove("Blue");
	        if (removed) {
	            System.out.println("\"Blue\" was removed from the list.");
	        } else {
	            System.out.println("\"Blue\" was not found in the list.");
	        }

	        // Display updated list
	        System.out.println("Updated color list: " + colors);
	    }
	}


