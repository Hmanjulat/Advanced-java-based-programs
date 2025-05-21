package A1;
import java.util.LinkedList;
import java.util.Collections;
public class SwapElements1 {
	

	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");    // index 0
	        colors.add("Blue");   // index 1
	        colors.add("Green");  // index 2
	        colors.add("Yellow"); // index 3

	        System.out.println("Original LinkedList: " + colors);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);

	        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colors);
	    }
	}


