package A1;
import java.util.*;
public class IterateFromSecond {
	
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
	        System.out.println("Color list: " + colorList);

	        // Create a ListIterator starting at index 1 (2nd element)
	        Iterator<String> iterator = colorList.listIterator(1);

	        // Iterate from the 2nd element
	        System.out.println("Iterating from the 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


