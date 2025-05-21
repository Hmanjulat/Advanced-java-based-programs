package A1;
import java.util.*;
public class ReverseIteratorDemo {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add colors to the list
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("Blue");
	        colorList.add("Yellow");
	        colorList.add("Orange");

	        // Display original list
	        System.out.println("Original color list: " + colorList);

	        // Iterate using descendingIterator()
	        System.out.println("Iterating in reverse order:");
	        Iterator<String> reverseIterator = colorList.descendingIterator();
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


