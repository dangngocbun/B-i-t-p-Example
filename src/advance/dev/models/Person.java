package advance.dev.models;

public abstract class Person implements Comparable<Person> {
	String name;
	int old;
	public Person(String name, int old) {
		super();
		this.name = name;
		this.old = old;
	}
	
}
