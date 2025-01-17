/**
 * @author Deepak Gautam
 * @version 1.0
 * @since 31 Dec 2024 @ 3:06:35 pm
 */

package abstractClass;

abstract class Animal {
	abstract void sound();
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Lion extends Animal {
	void sound() {
		System.out.println("Lion roars");
	}
	public static void main(String[] args) {
		Animal a = new Lion();
		a.eat();
		
		Lion l = new Lion();
		l.sound();
		l.eat();
		
		Lion l2 = new Lion();
		l2.sound();
		l2.eat();
	}
}

