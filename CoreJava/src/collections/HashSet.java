/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 2:13:58 pm
 */

package collections;

import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<String> hs = new java.util.HashSet<>();
		
		//a. adding elements
		hs.add("zero");
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		hs.add("seven");
		hs.add("eight");
		hs.add("nine");
		hs.add("ten");
		// NO DUBLICATE element
		System.out.println("After adding elements: ");
		System.out.println("hs: " + hs);
		hs.add("nine");
		System.out.println("After adding dublicate element: ");
		System.out.println("hs: " + hs);
		
		//b. Iterating, using Iterator object
		Iterator<String> itr = hs.iterator();
		System.out.println("\nIterating HashSet: ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		//c. clone/copy
		System.out.println("\nClone of HashSet: ");
		System.out.println(hs.clone());
		
		//c. removing specific element
		System.out.println("zero");
		System.out.println("\nAfter removing element 'zero' : ");
		System.out.println("hs: " + hs);
		
		//f. empty checking
		System.out.println("\nChecking if the set is empty: ");
		System.out.println(hs.isEmpty());
		
		//h. size
		System.out.println("\nSize of the HashSet: ");
		System.out.println(hs.size());

		//d. element present
		System.out.println("\nElement 'one' is present in the hashset: ");
		System.out.println(hs.contains("one"));
		
		//j. remove all element
		System.out.println("\nAfter removing all element");
		hs.clear();
		System.out.println("hs: " + hs);
	}

}

