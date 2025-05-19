package A1;
import java.util.*;
public class InsertAtEnd {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add initial colors
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");

	        // Display original list
	        System.out.println("Original color list: " + l_list);

	        // Insert "Pink" at the end
	        l_list.offerLast("Pink");

	        // Display updated list
	        System.out.println("Updated color list after adding 'Pink' at the end: " + l_list);
	    }
	}


