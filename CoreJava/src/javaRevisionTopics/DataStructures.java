/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 14 Jan 2025 @ 4:28:51 am
 */

package javaRevisionTopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
	public static void main(String[] args) {
		//Arrays
		int[] array = {1, 2, 3, 4};
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//ArrayList
		System.out.println();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.print(arrayList);
		//HashMap
		System.out.println();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 400);
		System.out.print(map);
		//statck
		System.out.println();
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);
		System.out.print(stack);
		//Queue (LinkedList implementation):
		System.out.println();
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1000);
		queue.add(2000);
		queue.add(3000);
		queue.add(4000);
		System.out.print(queue);
	}

}

