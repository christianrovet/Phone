package models;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy s = new Galaxy("S", 3, "Boost Mobile", "Chimes! :)");
		s.displayInfo();
		IPhone x = new IPhone("X", 76, "Verizon", "Bells");
		
		System.out.println(s.ring());
		System.out.println(s.unlock());
		
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());
	}

}
