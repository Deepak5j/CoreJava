/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 5:22:45 am
 */

package constructors;

class ParentClass {
    int rollNo;
    String name;
    String branch;

    ParentClass() {
        System.out.println("Student Details");
    }

    ParentClass(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    ParentClass(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument {
	public static void main(String[] args) {
		new ParentClass();
        new ParentClass(123);
        new ParentClass("Deepak", "CSE");

	}
}

