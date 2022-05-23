package advance.dev.models;

public class Teacher extends Person {
	double salary;
	public Teacher(String name, int old, double salary) {
		super(name, old);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return String.format("name:%s - salary:%.2f", name, salary);
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
