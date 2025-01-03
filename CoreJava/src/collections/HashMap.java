/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 3 Jan 2025 @ 1:32:18 pm
 */

package collections;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap<Integer, String> hm = new java.util.HashMap<>();
		
		//a. inserting 
		hm.put(1, "Deepak Gautam");
		hm.put(2, "Abhay Tiwari");
		hm.put(3, "Amar Prakash Pandey");
		hm.put(4, "Deepak Gaur");
		hm.put(5, "Deepak Kumar");
		hm.put(6, "Darshit Raj");
		hm.put(7, "Aman Arya");
		hm.put(8, "Saurabh Kumar");
		hm.put(9, "Ashish Upadhyay");
		hm.put(10, "Manish Pathak");
		
		//b. fetching values
		System.out.println("\nName of the student with ID no = 6: ");
		System.out.println(hm.get(6));
		
		//c. creating clone
		System.out.println("\nCopy of HashMap hm: ");
		System.out.println(hm.clone());
		
		//d. checking existence of ID
		System.out.println("\nID No = 3 is in the map: ");
		System.out.println(hm.containsKey(3));
		
		//e. checking if value is in map
		System.out.println("\nStudent Name: 'Deepak Kumar' is in the map: ");
		System.out.println(hm.containsValue("Deepak Kumar"));
		
		//f. checking if the map is empty using isEmpy()
		System.out.println("\nChecking if the map is empty: ");
		System.out.println(hm.isEmpty());
		
		//g. printing the size of map
		System.out.println("\nThe size of the map is : ");
		System.out.println(hm.size());
		
		//h. printing all the key of the map
		System.out.println("\nAll ID No of the student: ");
		System.out.println(hm.keySet());
		
		//j. removing a specific key-value pair
		System.out.println("\nRemove ID no = 2, Student name = 'Abhay Tiwari': ");
		System.out.println("Before: " + hm);
		hm.remove(2, "Abhay Tiwari");
		System.out.println("After: " + hm);
		
		//k. copying all the elements to other map
		System.out.println("\nCopied all the elements of the hm to hmNew: ");
		java.util.HashMap hmNew = new java.util.HashMap<>();
		hmNew.putAll(hm);
		System.out.println("hmNew: " + hmNew);		
	}

}

