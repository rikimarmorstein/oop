package school;

public class Person {

	private String name;
	private int age;
	
	
	public Person() {
		super();
		this.name =name;
		this.age = (int)(Math.random()*101)+20;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "  " + name + ", age - " + age + " ";
	}
	
	
	
}
