/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 30 Dec 2024 @ 3:55:59 pm
 */

public class Strings {
	public static void main(String[] args) {
		//1. String creation
		String s1 = "String creation by Class variable. Created in STRIING CONSTANT POOL";
		System.out.println(s1);
		String s2 = new String("String creation by object. Created object placed in HEAP");
		System.out.println(s2);
		
		//2. concatination using + plus operator
		String sc1 = "This is string 1";
		String sc2 = "This is string 2";
		String sc1sc2 = sc1 + sc2;
		System.out.println(sc1sc2);
	
		//3. Finding the length of the string
		String s3 = "Length of this string is 27";
		int len = s3.length();
		System.out.println("Length for this string '" + s3 + "' is " + len);
		
		//4. Sub string
		String es = "Extracting string";
		String sub = es.substring(2, 10);
		System.out.println("Sub string of '" + es + "' is '" + sub + "'");
		
		//5. Searching in string using indexOf()
		String s4 = "Searching index";
		int ind1 = s4.indexOf("index");
		int ind2 = s4.indexOf("h", 3);
		System.out.println("At Index: " + ind1);
		System.out.println("At Index: " + ind2);
		
		//6. Matching a String against a regular expression with matches()
		String s5 = "Matching a String";
		boolean match = s5.matches("(.*)String(.*)");
		System.out.println("Matches: " + match);
		
		//7. comparing strings
		String s6 = "Comparing strings CAPITAL";
		String s7 = "Comparing strings capital";
		
		//a. equals()
		boolean equalsMethod = s6.equals(s7);
		System.out.println("Result by equals() on '" + s6 +"' == '"+ s7 + "': " + equalsMethod);
		
		//b. equalsIgnoreCase()
		boolean equalIgnoreCaseMethod = s6.equalsIgnoreCase(s7);
		System.out.println("Result by equals() on '" + s6 +"' == '"+ s7 + "': " + equalIgnoreCaseMethod);
		
		//c. startsWith() method
		boolean startWithMethod = s6.startsWith("Comp");
		System.out.println("Checking if string '" + s6 + "' starts with 'Comp': " + startWithMethod);
		
		//d. endsWith() method
		boolean endWithMethod = s7.endsWith("tal");
		System.out.println("Checking if string '" + s7 + "' ends with 'tal': " + endWithMethod);
		
		//e. compareTo() return 0 if both equal
		int compToMethod = s6.compareTo(s7);
		System.out.println("'" + s6 + "' == '" + s7 + "': " + compToMethod);
		
		//f. compareTo() return 0 if both equal
		int compToIgnorCaseMethod = s6.compareToIgnoreCase(s7);
		System.out.println("'" + s6 + "' == '" + s7 + "': " + compToIgnorCaseMethod);
		
		//9. trimming == removes LEADING and TRAILING spaces
		String ts = "    Trimming String   ";
		String trm = ts.trim();
		System.out.println("Trimmed: " + trm);
		
		//10. replacing characters
		String rs = "Replacing string";
		String rpl = rs.replace("g", "x"); // all g replaced by x in rs string
		
		//11. splitting
		String ss = "Splitting String";
		String[] spl = ss.split(" ");
		//print splitted 
		for(String i: spl) {
			System.out.print("Splitted characters: " + i);
		}
		
		//12. Converting numbers to String with valueOf()
		int ns = 11;
		String nts = String.valueOf(ns);
		System.out.println("Converted Num to Str: "+ nts + 22);
		
		//13. Converting integers objects to Strings
		int is = 11;
		String its2 = Integer.toString(is);
		System.out.println("Converted int to str: " + its2 + 33);
		
		//14. Converting uppercase and lowercase
		String a = "upper case";
		String b = "LOWER CASE";
		String c = a.toUpperCase();
		String d = b.toLowerCase();
		System.out.println("String '" + a + "'Converted to upper case: " + c);
		System.out.println("String '" + b + "'Converted to lower case: " + d);
			
	}

}

