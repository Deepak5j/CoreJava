/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 5:09:19 am
 */

package constructors;

class ParentClass {
    int rollNo;
    String name;
    String branch;
    
    ParentClass() {
        System.out.println("Parent default constructor called");
    }

    ParentClass(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Parent parameterized constructor with rollNo called: " + rollNo);
    }

    ParentClass(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Parent parameterized constructor with name and branch called: " + name + ", " + branch);
    }
}

class ChildClass extends ParentClass  {
	String clg;
	String city;
	
	ChildClass() {
		super();
	}
	
	ChildClass(int rollNo) {
		super(rollNo);
	}
	
	ChildClass(String name, String branch, String clg, String city) {
		super(name, branch);
		this.clg = clg;
		this.city = city;
		System.out.println("College: " + this.clg);
	}
}

public class CallSuperFromChild {
	public static void main(String[] args) {
		new ChildClass();
		new ChildClass(123);
		new ChildClass("Deepak", "CSE", "SRMGPC", "Hyderbad");
	}
}

