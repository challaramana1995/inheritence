package package1;

public class UnCheckedException {

	public static void main(String[] args) {
     System.out.println("start");
     String[]name = new String[5];
     try {
    	 System.out.println(name[0]);
    	 System.out.println(name[5]);
     }catch(ArrayIndexOutOfBoundsException exception) {
    	 System.err.println(exception.toString());
     }catch(ArithmeticException exception) {
    	 System.out.println(exception.toString());
     }finally {
    	 System.out.println("finally block");
     }
     System.out.println("End");
	}

}
