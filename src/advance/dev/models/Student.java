package advance.dev.models;

public class Student extends Person {
	double mark;

	public Student(String name, int old, double mark) {
		super(name, old);
		this.mark = mark;
		
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String toString() {
		return String.format("name:%s - mark:%.2f", name, mark);
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
