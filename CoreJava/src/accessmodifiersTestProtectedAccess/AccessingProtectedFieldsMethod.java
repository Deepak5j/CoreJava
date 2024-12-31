/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:00:19 pm
 */

package accessmodifiersTestProtectedAccess;

//other package accessmodifiers
//it have class ProtectedClassFieldsMethod
import accessmodifiers.ProtectedClassFieldsMethod;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {
	public static void main(String[] args) {
		AccessingProtectedFieldsMethod obj = new AccessingProtectedFieldsMethod();
		obj.name = "Protected Method in SubClass"; // from different package and different class
		obj.protectedMethod(); // from different package and different class
	}	

}

