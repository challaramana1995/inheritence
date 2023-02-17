package package1;

import org.apache.hc.core5.http.Message;

public class message {
	public static void display() {
		System.out.println("Hello------");
	}
	public static void display(String fristName) {
		System.out.println("Hello-----"+fristName);
	}
	public static void display(String fristName,String lastName) {
		System.out.println("Hello-----"+fristName+""+lastName);
		
	}
	public static void main(String[]args) {
		message.display();
		message.display("Ramana");
		message.display("Ramana","CH");

	}
}
