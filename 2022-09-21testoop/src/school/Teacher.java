package school;

import java.util.Arrays;

public class Teacher extends Person {
	
	private Name professions;

	private static int c=0;

	private static int d=1;

	
	public Teacher() {
		super();
		super.setName("Teaher" + d++);
		if(c<6) {
				this.professions= Name.values()[c++];
					}else {
						c=0;
						this.professions= Name.values()[c++];
					}
				}

	
	@Override
	public String toString() {
		return  super.toString() + " profession " +professions;
	}


	public Name getProfessions() {
		return professions;
	}

	
	
}
