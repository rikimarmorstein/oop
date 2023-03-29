package Hospital;

public abstract class  Person {
	
	private static int c=0;
	private int id;
	private static int d=0;

	private String name ;
	private int age ;
	
	public Person() {
		super();
		this.name =  "Person"+(int)++d;
		this.age = (int)(Math.random()*103)+18;
this.id = ++c;
}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		
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
		return "id=" + id + ", name=" + name + ", age=" + age+ "  " ;
	}
	
	
	
	
}
