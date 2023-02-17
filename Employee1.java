package package1;

public class Employee1 {
	private  int id;
	private double salary;
	private String name;
	public void setId(int Id) {
		if(id<=0) {
			System.out.println("Invalid Eemployee");
			System.exit(1);
		}else {
			this.id = id;
			}
	}
public int getId() {
	return id;
	}
public void setsalary(double salary) {
	this.salary = salary;
} 
public double getsalary() {
	return salary;
	
}
public void setName(String name) {
	this.name = name;
	
}
public String getname() {
	return name;
}

}
  