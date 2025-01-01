/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 5:22:45 am
 */

package constructors;

class ParentClass1 {
    int rollNo;
    String name;
    String branch;

    ParentClass1() {
        System.out.println("Student Details");
    }

    ParentClass1(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    ParentClass1(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument {
	public static void main(String[] args) {
		new ParentClass1();
        new ParentClass1(123);
        new ParentClass1("Deepak", "CSE");

	}
}

