
class Phone {
	static boolean softKeyboard = true;
}


class TestPhone {
	
	public static void main(String[] args) {
		
		Phone.softKeyboard = false;
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		
		System.out.println(p1.softKeyboard);  // false
		System.out.println(p2.softKeyboard);  // false
		
		p1.softKeyboard = true;
		
		System.out.println(p1.softKeyboard);  // true
		System.out.println(p2.softKeyboard);  // true
		System.out.println(Phone.softKeyboard);  // true
		
		// We can access the static variable using null reference
		Phone p3 = null;
		System.out.println(p3); // null
		System.out.println(p3.softKeyboard);  // true
		
		
	}
}
