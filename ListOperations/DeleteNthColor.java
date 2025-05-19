package A1;
import java.util.*;
public class DeleteNthColor {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original color list: " + colors);

	        // Define the index (n-th element to delete, e.g., 2nd element = index 1)
	        int indexToRemove = 2;

	        // Check if index is valid
	        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
	            String removedColor = colors.remove(indexToRemove);
	            System.out.println("Removed element at index " + indexToRemove + ": " + removedColor);
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }

	        // Display the updated list
	        System.out.println("Updated color list: " + colors);
	    }
	}


