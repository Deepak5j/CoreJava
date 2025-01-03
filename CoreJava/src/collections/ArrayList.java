/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 12:21:04 pm
 */

package collections;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList {
	public static void main(String[] args) {
		java.util.ArrayList<String> ls = new java.util.ArrayList<>
			(Arrays.asList("zero", "one", "two", "three", "four", "five"));
		System.out.println("\nList: " + ls);
		
		//a. adding elements to the ArrayList using add()
		ls.add("six");
		ls.add("seven");
		ls.add("eight");
		ls.add("nine");
		System.out.println("\nAfter adding new elements: ");
		System.out.println("\nList: " + ls);
		
		//b. Iterating through the ArrayList by using Iterator object
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		//c. Adding an element at specific index using add()
		ls.add(1, "AtIndex1");
		System.out.println("\nAfter adding an element at index 1: ");
		System.out.println("List: " + ls);
		
		//d. Removing an element at specific index using add()
		ls.remove(1);
		System.out.println("\nAfter removing an element at index 1: ");
		System.out.println("List: " + ls);
		
		//e. updating at specific index, using set()
		ls.set(1, "ONE");
		System.out.println("\nAfter updating the element at index 1: ");
		System.out.println("List: " + ls);
		
		//f. checking element present, at particular index
		System.out.println("\nThe element is present at index: ");
		System.out.println(ls.indexOf("three"));
		
		//g. getting an element at a particular index using get()
		System.out.println("\nThe element at index 3: ");
		System.out.println(ls.get(3));
		
		//h. Finding the size of the ArrayList using size()
		System.out.println("\nSize of the ArrayList: ");
		System.out.println(ls.size());
		
		//i. checking the element is present in the ArrayList using contains()
		System.out.println("\n'two' is present in the ArrayList: ");
		System.out.println(ls.contains("two"));
		
		//j. Removing all elements of the ArrayList using clear()
		System.out.println("\nAfter removing all elements of the ArrayList: ");
		ls.clear();
		System.out.println("List: " + ls);		
		
	}

}

