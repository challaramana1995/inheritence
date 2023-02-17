package package1;

public class B2 extends A1 {
	public void m2() {
		System.out.println("m2");
	}
	public static void main (String[]args) {
		B2 b2 = new B2();
		b2.m1();
		b2.m2();
	}

}
