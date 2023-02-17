package package1;

public class Employee2 {
	private int id;
	private double salary;
	private String name;
	public Employee2(int id,double salary,String name) {
		this.id= id;
		this.salary = salary;
		this.name = name;
		}
	@Override
	public String toString() {
		return id+""+salary+""+name;
	}
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1111, 999999.99, "Ramana");
		System.out.println(e1.toString());

	}

}
