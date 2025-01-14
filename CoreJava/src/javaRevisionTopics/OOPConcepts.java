/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 15 Jan 2025 @ 5:10:58 am
 */

package javaRevisionTopics;

public class OOPConcepts {
	

}

// Encapsulation
class Employee {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}

// Inheritance
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void barks() {
		System.out.println("Dog barks");
	}
}

// Polymorphism
class Shape {
	void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");
	}
}

// Abstraction
abstract class Vehicle {
	abstract void start();
}
class Car extends Vehicle {
	void start() {
		System.out.println("Car starts with a key.");
	}
}



