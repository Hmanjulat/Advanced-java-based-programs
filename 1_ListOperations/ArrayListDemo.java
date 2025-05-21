package A1;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
        arrayList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Second element: " + arrayList.get(1));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana");

        // 7. Searching elements
        System.out.println("Contains Mango? " + arrayList.contains("Mango"));

        // 8. List size
        System.out.println("List size: " + arrayList.size());

        // 9. Iterating over list using for-each
        System.out.println("For-each iteration:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("Sorted list: " + arrayList);

        // 12. Sublist
        List<String> subList = arrayList.subList(0, 3);
        System.out.println("Sublist (0-2): " + subList);

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("Cleared list: " + arrayList);
    }
}
