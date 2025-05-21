package A1;
import java.util.*;
public class DisplayWithPositions {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add colors
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");
	        l_list.add("Yellow");
	        l_list.add("Orange");

	        // Display elements with their positions
	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < l_list.size(); i++) {
	            System.out.println("Position " + i + ": " + l_list.get(i));
	        }
	    }
	}


