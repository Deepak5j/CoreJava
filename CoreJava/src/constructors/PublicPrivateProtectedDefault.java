/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 1 Jan 2025 @ 5:25:12 am
 */

package constructors;

public class PublicPrivateProtectedDefault {
	int rollNo;
	String name;
	String clg;
	String city;
	{
		System.out.println("Student Details");
	}
	PublicPrivateProtectedDefault() {
		this(11);
	}
	public PublicPrivateProtectedDefault(int roll) {
		this("Deepak");
		this.rollNo = roll;
	}
	private PublicPrivateProtectedDefault(String name) {
		this("SRMGPC", "Delhi");
	}
	protected PublicPrivateProtectedDefault(String clg, String city) {
		this.clg = clg;
		this.city = city;
		System.out.println("college: " + clg);
		System.out.println("city: " + city);
	}
	public static void main(String[] args) {
		PublicPrivateProtectedDefault obj = new PublicPrivateProtectedDefault();
		
	}

}

